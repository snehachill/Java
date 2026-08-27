import java.util.*;
public class JobScheduling {
    // A class to represent a job
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int[][] jobs = {{4,20}, { 1, 30}, {1, 40}};
        // Create a list of jobs
        ArrayList<Job> job = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++) {
            job.add(new Job(i, jobs[i][0], jobs[i][1]));
        }
        Collections.sort(job, (a, b) -> b.profit - a.profit);
        int time=0;
        for(int i=0;i<job.size();i++){
            if(job.get(i).deadline>time){
                time++;
                System.out.println("Job id: "+job.get(i).id+" Profit: "+job.get(i).profit);
            }
        }
    }
}
