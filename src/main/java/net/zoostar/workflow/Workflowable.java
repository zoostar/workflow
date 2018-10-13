package net.zoostar.workflow;

public interface Workflowable<T extends Workflowable<T>> {
	State<T> getState();
}
