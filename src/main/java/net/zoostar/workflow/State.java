package net.zoostar.workflow;

import java.util.List;

public interface State<T extends Workflowable<T>> {
	String toString();
	List<Action<T>> getActions();
}
