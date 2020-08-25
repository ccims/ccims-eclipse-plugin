package de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager;

import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.ID;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Component;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ComponentInterface;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Issue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Label;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Project;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Query;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.User;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface;

public class DataMapper {
	
	private Map<ID, de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component> componentMap;
	private Map<ID, Interface> interfaceMap;
	private Map<ID, Developer> developerMap;
	private Map<ID, de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label> labelMap;
	private Map<ID, CrossComponentIssue> issueMap;
	
	private CcimsDatamodelFactory fac;
	
	private String apiLocationUri;
	
	public DataMapper(String apiLocationUri) {
		this.apiLocationUri = apiLocationUri;
		fac = CcimsDatamodelFactory.eINSTANCE;
		componentMap = new HashMap<>();
		interfaceMap = new HashMap<>();
		developerMap = new HashMap<>();
		labelMap = new HashMap<>();
		issueMap = new HashMap<>();
	}

	public CrossComponentIssueManagementSystem mapToEObject(Query apiQuery) {
		CrossComponentIssueManagementSystem result = fac.createCrossComponentIssueManagementSystem();
		result.setLocationUri(apiLocationUri);
		
		//components and provided interfaces
		for (Project project: apiQuery.getProjects().getNodes()) {
			for(Component component : project.getComponents().getNodes()) {
				var ecoreComponent = getEcoreComponent(component);
				result.getComponents().add(ecoreComponent);
				
				for(ComponentInterface compInterface : component.getInterfaces().getNodes()) {
					var ecoreInterface = getEcoreInterface(compInterface);
					ecoreComponent.getProvidedInterfaces().add(ecoreInterface);
				}
			}
		}
		
		//consumed interfaces
		for (Project project: apiQuery.getProjects().getNodes()) {
			for (Component component : project.getComponents().getNodes()) {
				for (ComponentInterface compInteface : component.getConsumedInterfaces().getNodes()) {
					componentMap.get(component.getId()).getConsumedInterfaces().add(interfaceMap.get(compInteface.getId()));
				}
			}
		}
		
		//developers
		for (Project project: apiQuery.getProjects().getNodes()) {
			for (User user: project.getUsers().getNodes()) {
				result.getDevelopers().add(getEcoreDeveloper(user));
			}
		}
		
		//issues
		for (Project project: apiQuery.getProjects().getNodes()) {
			for (Issue issue: project.getIssues().getNodes()) {
				result.getManagedCroCoIssues().add(getEcoreIssue(issue));
			}
		}
		
		//issue link
		for (Project project: apiQuery.getProjects().getNodes()) {
			for (Issue issue: project.getIssues().getNodes()) {
				for(Issue linkedIssue : issue.getLinkedIssues().getNodes()) {
					issueMap.get(issue.getId()).getLinkedIssues().add(issueMap.get(linkedIssue.getId()));
				}
			}
		}
		
		return result;
	}
	
	private de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component getEcoreComponent(Component component) {
		ID id = component.getId();
		if(componentMap.containsKey(id)) {
			return componentMap.get(id);
		} 
		
		var result = fac.createComponent();
		result.setName(component.getName());
		componentMap.put(id, result);
		return result;
	}
	
	private Interface getEcoreInterface(ComponentInterface compInterface) {
		ID id = compInterface.getId();
		if(interfaceMap.containsKey(id)) {
			return interfaceMap.get(id);
		}
		
		var result = fac.createInterface();
		result.setName(compInterface.getName());
		interfaceMap.put(id, result);
		return result;
	}
	
	private Developer getEcoreDeveloper(User user) {
		ID id = user.getId();
		if(developerMap.containsKey(id)) {
			return developerMap.get(id);
		}
		var result = fac.createDeveloper();
		result.setName(user.getUsername());
		developerMap.put(id, result);
		return result;
	}
	
	private CrossComponentIssue getEcoreIssue(Issue issue) {
		ID id = issue.getId();
		if(issueMap.containsKey(id)) {
			return issueMap.get(id);
		}
		var result = fac.createCrossComponentIssue();
		result.setTitle(issue.getTitle());
		result.setTextBody(issue.getBody());
		result.setIsOpen(issue.getIsOpen());
		
		for(User user: issue.getAssignees().getNodes()) {
			result.getAssignees().add(developerMap.get(user.getId()));
		}
		
		for(Label label: issue.getLabels().getNodes()) {
			result.getLabels().add(getEcoreLabel(label));
		}
				
		issueMap.put(id, result);
		return result;
	}
	
	private de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label getEcoreLabel(Label label) {
		ID id = label.getId();
		if(labelMap.containsKey(id)) {
			return labelMap.get(id);
		}
		var result = fac.createLabel();
		result.setName(label.getName());
		
		labelMap.put(id, result);
		return result;
	}
}
