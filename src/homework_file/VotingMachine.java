package homework_file;

public class VotingMachine
{

    private int numberYesVotes;
    private int numberNoVotes;
    private String votingIssue;

    public voteYes()
    {
        numberYesVotes++;
    }

    public voteNo()
    {
        numberNoVotes++;
    }

    public returnYesCount()
    {
        return numberYesVotes;
    }

    public returnNoCount()
    {
        return numberNoVotes;
    }

    public clearMachine()
    {
        numberYesVotes = 0;
        numberNoVotes = 0;
    }

    public String toString()
    {
        return " Yes Votes: " + numberYesVotes + " No Votes: " + numberNoVotes;
    }

}
