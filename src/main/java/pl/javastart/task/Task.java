package pl.javastart.task;

public class Task {
    private final String name;
    private final String description;
    private int priority;
    private Person assignedPersonToTask;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description, int priority, Person assignedPersonToTask) {
        this(name, description, priority);
        this.assignedPersonToTask = assignedPersonToTask;
    }

    private boolean highPriority() {
        return priority > 0;
    }

    private boolean mediumPriority() {
        return priority == 0;
    }

    private boolean lowPriority() {
        return priority < 0;
    }

    public void showTaskPriorityDescription() {
        if (lowPriority()) {
            printTaskPriorityDescription("niski");
        } else if (mediumPriority()) {
            printTaskPriorityDescription("średni");
        } else if (highPriority()) {
            printTaskPriorityDescription("wysoki");
        } else {
            printTaskPriorityDescription("nieprzypisany");
        }
    }

    private void printTaskPriorityDescription(String priorityDesc) {
        System.out.printf("Zadanie: %s - ma priorytet %s %n", this.name, priorityDesc);

    }
}
