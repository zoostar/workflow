package net.zoostar.workflow;

import java.util.List;

public interface State {
	List<Action<Workflowable>> getActions();
}
