package net.zoostar.workflow;

public interface Action<T extends Workflowable<T>> {
	void execute(T workflowable) throws WorkflowException;
}
