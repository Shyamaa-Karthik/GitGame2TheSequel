package com.example.gitgame2thesequel;

import java.util.ArrayList;

import java.util.Arrays;



public class VocabTerm {

    private String word = new String();

    private String definition = new String();

    private static ArrayList<String> wordNames = new ArrayList<>(Arrays.asList("access token", "blame", "branch", "clone", "collaborator", "commit", "commit message", "contributor", "default branch", "diff", "feature branch", "fetch", "force push", "fork", "issue", "main", "merge", "organization", "private repository", "public repository", "pull", "pull request", "push", "repository", "upstream"));

    private static ArrayList<String> wordDefinitionsBlank = new ArrayList<>(Arrays.asList("A token that is used in place of a password when performing Git operations over HTTPS with Git on the command line or the API. Also called a personal __________.","The __________ feature in Git describes the last modification to each line of a file, which generally displays the revision, author and time. This is helpful, for example, in tracking down when a feature was added, or which commit led to a particular bug.","A __________ is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the \"live\" version. When you've made the changes you want to make, you can merge your __________ back into the main branch to publish your changes.","A __________ is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. When you make a __________, you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. The repository you __________ is still connected to the remote version so that you can push your local changes to the remote to keep them synced when you're online.","A __________ is a person with read and write access to a repository who has been invited to contribute by the repository owner.","A __________, or \"revision\", is an individual change to a file (or set of files). When you make a __________ to save your work, Git creates a unique ID (a.k.a. the \"SHA\" or \"hash\") that allows you to keep record of the specific changes __________ along with who made them and when. __________ usually contain a __________ message which is a brief description of what changes were made.","Short, descriptive text that accompanies a __________ and communicates the change the __________ is introducing.","A __________ is someone who does not have collaborator access to a repository but has contributed to a project and had a pull request they opened merged into the repository.","The base branch for new pull requests and code commits in a repository. Each repository has at least one branch, which Git creates when you initialize the repository. The first branch is usually called main, and is often the __________.","A __________ is the difference in changes between two commits, or saved changes. The __________ will visually describe what was added or removed from a file since its last commit.","A branch used to experiment with a new feature or fix an issue that is not in production. Also called a topic branch.","When you use git __________, you're adding changes from the remote repository to your local working branch without committing them. Unlike git pull, __________ allows you to review changes before committing them to your local branch.","A Git push that overwrites the remote repository with local changes without regard for conflicts. Or, you know, a Star Wars ability.","A __________ is a personal copy of another user's repository that lives on your account. __________ allow you to freely make changes to a project without affecting the original upstream repository. You can also open a pull request in the upstream repository and keep your __________ synced with the latest changes since both repositories are still connected.","__________ are suggested improvements, tasks or questions related to the repository. __________ can be created by anyone (for public repositories), and are moderated by repository collaborators. Each __________ contains its own discussion thread. You can also categorize an __________ with labels and assign it to someone.","The default development branch. Whenever you create a Git repository, a branch named __________ is created, and becomes the active branch. In most cases, this contains the local development, though that is purely by convention and is not required.","__________ takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a \"pull request\" (which can be thought of as a request to __________), or via the command line. A __________ can be done through a pull request via the GitHub.com web interface if there are no conflicting changes, or can always be done via the command line.","__________ are a group of two or more users that typically mirror real-world __________. They are administered by users and can contain both repositories and teams.","__________ are only visible to the repository owner and collaborators that the owner specified.","A __________ can be viewed by anyone, including people who aren't GitHub users. I mean...did we expect anything else?","__________ refers to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date. See also fetch.","__________ are proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators. Like issues, __________ each have their own discussion forum.","To __________ means to send your committed changes to a remote repository on GitHub.com. For instance, if you change something locally, you can __________ those changes so that others may access them.","A __________ is the most basic element of GitHub. They're easiest to imagine as a project's folder. A __________ contains all of the project files (including documentation), and stores each file's revision history. __________ can have multiple collaborators and can be either public or private.","When talking about a branch or a fork, the primary branch on the original repository is often referred to as the __________, since that is the main place that other changes will come in from. The branch/fork you are working on is then called the \"downstream\". Also called origin."));
    private static ArrayList<String> wordDefinitions = new ArrayList<>(Arrays.asList("A token that is used in place of a password when performing Git operations over HTTPS with Git on the command line or the API. Also called a personal access token.","The \"blame\" feature in Git describes the last modification to each line of a file, which generally displays the revision, author and time. This is helpful, for example, in tracking down when a feature was added, or which commit led to a particular bug.","A branch is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the \"live\" version. When you've made the changes you want to make, you can merge your branch back into the main branch to publish your changes.","A clone is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. When you make a clone, you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. The repository you cloned is still connected to the remote version so that you can push your local changes to the remote to keep them synced when you're online.","A collaborator is a person with read and write access to a repository who has been invited to contribute by the repository owner.","A commit, or \"revision\", is an individual change to a file (or set of files). When you make a commit to save your work, Git creates a unique ID (a.k.a. the \"SHA\" or \"hash\") that allows you to keep record of the specific changes committed along with who made them and when. Commits usually contain a commit message which is a brief description of what changes were made.","Short, descriptive text that accompanies a commit and communicates the change the commit is introducing.","A contributor is someone who does not have collaborator access to a repository but has contributed to a project and had a pull request they opened merged into the repository.","The base branch for new pull requests and code commits in a repository. Each repository has at least one branch, which Git creates when you initialize the repository. The first branch is usually called main, and is often the default branch.","A diff is the difference in changes between two commits, or saved changes. The diff will visually describe what was added or removed from a file since its last commit.","A branch used to experiment with a new feature or fix an issue that is not in production. Also called a topic branch.","When you use git fetch, you're adding changes from the remote repository to your local working branch without committing them. Unlike git pull, fetching allows you to review changes before committing them to your local branch.","A Git push that overwrites the remote repository with local changes without regard for conflicts. Or, you know, a Star Wars ability.","A fork is a personal copy of another user's repository that lives on your account. Forks allow you to freely make changes to a project without affecting the original upstream repository. You can also open a pull request in the upstream repository and keep your fork synced with the latest changes since both repositories are still connected.","Issues are suggested improvements, tasks or questions related to the repository. Issues can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion thread. You can also categorize an issue with labels and assign it to someone.","The default development branch. Whenever you create a Git repository, a branch named main is created, and becomes the active branch. In most cases, this contains the local development, though that is purely by convention and is not required.","Merging takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a \"pull request\" (which can be thought of as a request to merge), or via the command line. A merge can be done through a pull request via the GitHub.com web interface if there are no conflicting changes, or can always be done via the command line.","Organizations are a group of two or more users that typically mirror real-world organizations. They are administered by users and can contain both repositories and teams.","Private repositories are only visible to the repository owner and collaborators that the owner specified.","A public repository can be viewed by anyone, including people who aren't GitHub users. I mean...did we expect anything else?","Pull refers to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date. See also fetch.","Pull requests are proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators. Like issues, pull requests each have their own discussion forum.","To push means to send your committed changes to a remote repository on GitHub.com. For instance, if you change something locally, you can push those changes so that others may access them.","A repository is the most basic element of GitHub. They're easiest to imagine as a project's folder. A repository contains all of the project files (including documentation), and stores each file's revision history. Repositories can have multiple collaborators and can be either public or private.","When talking about a branch or a fork, the primary branch on the original repository is often referred to as the \"upstream\", since that is the main place that other changes will come in from. The branch/fork you are working on is then called the \"downstream\". Also called origin."));




    private static ArrayList<String> multipleChoiceOptions = new ArrayList<>(Arrays.asList("access token", "blame", "branch", "clone", "collaborator", "commit", "commit message", "contributor", "default branch", "diff", "feature branch", "fetch", "force push", "fork", "issue", "main", "merge", "organization", "private repository", "public repository", "pull", "pull request", "push", "repository", "upstream"));

    public static String getMultipleChoiceOptions(int count) {
        return multipleChoiceOptions.get(count);
    }


    public static String getWordDefinitionsBlank(int i) {
        return wordDefinitionsBlank.get(i);
    }

    public VocabTerm(String word, String definition){
        this.word = word;
        this.definition = definition;
    }



    public static ArrayList<String> getWordNames() {
        return wordNames;
    }

    public static int GetListSize() {
        return wordNames.size();
    }

    public static int GetChoiceOptionsSize() {
        return multipleChoiceOptions.size();
    }

    public static void setWordNames(int counter){
        wordNames.remove(counter);
    }



    public static ArrayList<String> getWordDefinitions() {
        return wordDefinitions;
    }

    public static void setWordDefinitions(int counter){
        wordDefinitions.remove(counter);
    }



    public static String getDefinition(int index){
        return (wordDefinitions.get(index));
    }

    public static String getWord(int index){
        return (wordNames.get(index));
    }



}

