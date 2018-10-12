package net.zoostar.workflow;

import java.util.List;

public interface State<T extends Workflowable> {
	List<Action<T>> getActions();
}
