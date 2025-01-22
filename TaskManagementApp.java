public class TaskManagementApp {
    public static void main(String[] args) {

        Task simpleTask1 = new SimpleTask("Codificação Completa");
        Task simpleTask2 = new SimpleTask("Escrever documentação");


        TaskList projectTasks = new TaskList("Tarefas do Projeto");
        projectTasks.addTask(simpleTask1);
        projectTasks.addTask(simpleTask2);


        TaskList phase1Tasks = new TaskList("Tarefas da Fase 1");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementação"));

        projectTasks.addTask(phase1Tasks);


        projectTasks.display();
    }
}