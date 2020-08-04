package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;


import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;

public class LabelIconProvider {
	public static String getIconFor(CrossComponentIssue issue, int scale) {
		StringBuilder file = new StringBuilder();
		file.append("bug_");
		if(issue.isIsOpen()) {
			file.append("new");
		} else {
			file.append("done");
		}
		
		if(scale > 1) {
			file.append("@");
			file.append(scale);
			file.append("x");
		}
		
		file.append(".png");
		return file.toString();
	}

}
