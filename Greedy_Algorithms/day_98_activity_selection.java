package Greedy_Algorithms;

class Activity{
    int start, finish;

    Activity(int s, int f){
        start = s;
        finish = f;
    }
}

public class day_98_activity_selection{
    static void sortByFinishTime(Activity[] activities, int n){
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (activities[j].finish > activities[j + 1].finish){
                    Activity temp = activities[j];
                    activities[j] = activities[j + 1];
                    activities[j + 1] = temp;
                }
            }
        }
    }

    static void activitySelection(Activity[] activities, int n){
        sortByFinishTime(activities, n);
        System.out.println("Selected activities:");
        int lastFinish = activities[0].finish;
        System.out.println("(" + activities[0].start + ", " + activities[0].finish + ")");
        for (int i = 1; i < n; i++){
            if (activities[i].start >= lastFinish){
                System.out.println("(" + activities[i].start + ", " + activities[i].finish + ")");
                lastFinish = activities[i].finish;
            }
        }
    }

    public static void main(String[] args){
        Activity[] activities = {
            new Activity(1, 3),
            new Activity(2, 5),
            new Activity(0, 6),
            new Activity(5, 9),
            new Activity(8, 9),
            new Activity(5, 7)
        };

        int n = activities.length;

        activitySelection(activities, n);
    }
}
