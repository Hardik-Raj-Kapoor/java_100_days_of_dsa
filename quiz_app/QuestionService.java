package quiz_app;

import java.util.Scanner;

public class QuestionService {
    Scanner sc = new Scanner(System.in);
    Question[] question = new Question[5];
    String[] selection = new String[5];
    public QuestionService() {
        question[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        question[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        question[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        question[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        question[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

    }
    public void playQuiz() {
        int i = 0;
        for (Question q : question) {
            System.out.print("Question no. " + q.getId()+". ");
            System.out.println(q.getQuestion());
            System.out.println("Option 1 : " +q.getOpt1());
            System.out.println("Option 2 : " +q.getOpt2());
            System.out.println("Option 3 : " +q.getOpt3());
            System.out.println("Option 4 : " +q.getOpt4());
            System.out.print("Choose Option number: ");
            selection[i] = sc.nextLine();
            i++;
        }
        sc.close();
    // public void displayQuestions(){
    //     for(Question q: question){
    //         System.out.println(q);
    //     }

    for (String s : selection) {
            System.out.println("Options you seleceted: "+s);
        }
    }
    public void printScore() {
        int score = 0;
        for (int i = 0; i < question.length; i++) {
            Question que = question[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);

}
}
