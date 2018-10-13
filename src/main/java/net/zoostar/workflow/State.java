package net.zoostar.workflow;

import java.util.List;

public interface State<T extends Workflowable<T>> {
	List<Action<T>> getActions();
}
