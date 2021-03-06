/* 
Minh Tran
CS1400
Assignment 4
9/25/21 
*/

public class Question 
{
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;

    public Question(String question, String answer1, String answer2, String answer3, String answer4, int correctAnswer)
    {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * This returns the trivia question
     * @return the trivia question
     */
    public String getQuestion()
    {
        return question;
    }

    public String getAnswer1()
    {
        return answer1;
    }

    public String getAnswer2()
    {
        return answer2;
    }

    public String getAnswer3()
    {
        return answer3;
    }

    public String getAnswer4()
    {
        return answer4;
    }

    public int getCorrectAnswer()
    {
        return correctAnswer;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public void setAnswer1(String answer1)
    {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2)
    {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3)
    {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4)
    {
        this.answer4 = answer4;
    }

    public void setCorrectAnswer(int correctAnswer)
    {
        this.correctAnswer = correctAnswer;
    }

    public String toString()
    {
        return question + "\n1. " + answer1 + "\n2. " + answer2 + "\n3. " + answer3 + "\n4. " + answer4;
    }
}
