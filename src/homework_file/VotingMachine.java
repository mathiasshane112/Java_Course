package homework_file;

public class VotingMachine
{

    private int numberYesVotes;
    private int numberNoVotes;
    private String votingIssue;

    public void voteYes()

    {
        numberYesVotes++;
    }

    public void voteNo ()
    {
        numberNoVotes++;
    }

    public int returnYesCount()

    {
        return numberYesVotes;
    }

    public int returnNoCount()

    {
        return numberNoVotes;
    }

    public void clearMachine()
    {
        numberYesVotes = 0;
        numberNoVotes = 0;
    }

    public String toString()
    {
        return " Yes Votes: " + numberYesVotes + " No Votes: " + numberNoVotes;
    }

}
