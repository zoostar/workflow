package net.zoostar.workflow;

public interface WorkflowService<T extends Workflowable<T>> {
	T newInstance();
}
