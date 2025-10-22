import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    public ReportGenerator(){}

    // Générer un rapport des tâches terminées
    public void printCompletedTasks(List<Task> tasks) {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks(List<Task> tasks) {
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
