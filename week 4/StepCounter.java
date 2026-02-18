public class StepCounter {
    private static Integer totalStepsAllUsers = 0;
    private Integer individualSteps = 0;

    public void walk(int steps) {
        individualSteps += steps;
        totalStepsAllUsers += steps;
    }

    public static void resetGlobalSteps() {
        totalStepsAllUsers = 0;
    }

    public int getIndividualSteps() {
        return individualSteps;
    }

    public static int getTotalStepsAllUsers() {
        return totalStepsAllUsers;
    }

    public static void main(String[] args) {
        StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();
        userA.walk(500);
        userB.walk(700);
        System.out.println("UserA steps: " + userA.getIndividualSteps());
        System.out.println("UserB steps: " + userB.getIndividualSteps());
        System.out.println("Total steps: " + StepCounter.getTotalStepsAllUsers());
        StepCounter.resetGlobalSteps();
        System.out.println("Total: " + StepCounter.getTotalStepsAllUsers());
    }
}