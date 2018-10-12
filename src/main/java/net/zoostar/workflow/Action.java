package net.zoostar.workflow;

public interface Action<T extends Workflowable> {
	void execute(T workflowable) throws WorkflowException;
}
