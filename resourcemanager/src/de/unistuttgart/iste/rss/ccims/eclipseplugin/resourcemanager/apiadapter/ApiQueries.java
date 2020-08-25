package de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager.apiadapter;

import java.util.ArrayList;
import java.util.Arrays;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ComponentInterfaceQuery;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ComponentInterfaceQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ComponentPageQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ComponentQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.IssuePageQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ProjectFilter;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ProjectQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.QueryQuery.ProjectsArgumentsDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.QueryQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.ReactionGroupPageQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.UserPageQueryDefinition;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.UserQueryDefinition;

/**
 * A collection of graphQl queries used by this project.
 * 
 * @author Tim Neumann
 */
public class ApiQueries {

	private ApiQueries() {
		//hide
	}
	
	/**
	 * Get the username of the user being queried
	 */
	public static final UserQueryDefinition USER_USERNAME;
	
	/**
	 * Get all users of the queried list and for each user get the username
	 */
	public static final UserPageQueryDefinition ALL_USERS_USERNAME;
	
	/**
	 * Get all reactions of the queried list and for each reaction get the reaction and the users
	 */
	public static final ReactionGroupPageQueryDefinition ALL_REACTIONS;

	/**
	 * Get all data about the queried project
	 */
	public static final ProjectQueryDefinition PROJECT_ALL_DATA;
	
	public static final QueryQueryDefinition ALL_PROJECTS_ALL_DATA;
	
	static {
		
		USER_USERNAME = u -> u.username();
		ALL_USERS_USERNAME = p_u -> p_u.nodes(USER_USERNAME);
		
		ALL_REACTIONS = p_r -> p_r.nodes(r -> r
				.reaction()
				.users(USER_USERNAME));
		
		PROJECT_ALL_DATA = projectAllData();
		
		ALL_PROJECTS_ALL_DATA = q -> q.projects(p_p -> p_p.nodes(PROJECT_ALL_DATA));
	}
	
	/**
	 * Get a complete query for all data about the project with the given name.
	 * @param projectName The project name to get 
	 * @return
	 */
	public static QueryQueryDefinition getQueryForAllDataAboutProject(String projectName) {
		ProjectFilter filter = new ProjectFilter();
		filter.setName(Arrays.asList(projectName));
		
		ProjectsArgumentsDefinition argsDef = args -> args.filterBy(filter);
		return q -> q.projects(argsDef, p_p -> p_p.nodes(PROJECT_ALL_DATA));
	}
	
	private static ProjectQueryDefinition projectAllData() {
		return p -> p
				.components(allComponents())
				.issues(allIssues())
				.name()
				.owner(USER_USERNAME)
				.users(allUsers());
	}
	
	private static ComponentPageQueryDefinition allComponents() {
		return p_c -> p_c.nodes(c -> c
				.consumedInterfaces(p_i -> p_i.nodes(i -> i
						.name()))
				.description()
				.imsData()
				.imsType()
				.interfaces(p_i -> p_i.nodes(i -> i
						.description()
						.name()
						.owner(USER_USERNAME)
						.consumedBy(c_p_c -> c_p_c.nodes(c_c -> c_c.name()))))
				.name()
				.owner(USER_USERNAME));
	}
	
	private static UserPageQueryDefinition allUsers() {
		return p_u -> p_u.nodes(u -> u
				.displayName()
				.email()
				.username());
	}
	
	private static IssuePageQueryDefinition allIssues() {
		return p_i -> p_i.nodes(i -> i
				.assignees(ALL_USERS_USERNAME)
				.body()
				.category()
				.components(p_c -> p_c.nodes(c -> c.name()))
				.createdAt()
				.createdBy(USER_USERNAME)
				.currentUserCanComment()
				.currentUserCanEdit()
				.dueDate()
				.editedAt()
				.editedBy(USER_USERNAME)
				.estimatedTime()
				.id()
				.isDuplicate()
				.isOpen()
				.issueComments(p_c -> p_c.nodes(c -> c
									.body()
									.createdAt()
									.createdBy(USER_USERNAME)
									.currentUserCanEdit()
									.editedAt()
									.editedBy(USER_USERNAME)
									.reactions(ALL_REACTIONS)))
				.labels(p_l -> p_l.nodes(l -> l
						.colour()
						.description()
						.name()))
				.linkedIssues(p_li -> p_li.nodes(li -> li.id()))
				.locations(p_l -> p_l.nodes(l -> l
						.onComponent(c -> c.name())
						.onComponentInterface(ci -> ci.name())))
				.participants(ALL_USERS_USERNAME)
				.pinnedOn(p_c -> p_c.nodes(c -> c.name()))
				.reactions(ALL_REACTIONS)
				.spentTime()
				.startDate()
				//.timeline() //Not fetching timeline for now.
				.title()
				.updatedAt()
				);
	}
	
}
