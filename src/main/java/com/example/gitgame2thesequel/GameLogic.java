package com.example.gitgame2thesequel;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.ArrayList;

import java.util.Scanner;



    public class GameLogic {

        private static int score = 0;

        private static ArrayList<VocabTerm> vocabList = new ArrayList<>();



        private static Scanner reader = new Scanner(System.in);

        public static ArrayList<VocabTerm> getVocabList() {

            return vocabList;

        }



        public static void addVocabList(VocabTerm word) {

            GameLogic.vocabList.add(word);

        }



        public static void removeVocabList(VocabTerm word) {

            GameLogic.vocabList.remove(word);

        }



        public static void intro() {

            makeVocabs();



            System.out.println("Hello user! Welcome to the Vocab Game!(Where the answer is always the last option in easy mode!)");

            System.out.println("Select a difficulty mode: Easy or Hard");

            String difficulty = reader.nextLine();

            int listSize =  VocabTerm.GetListSize();

            if(difficulty.equals("Easy") || difficulty.equals("easy")){

                boolean easyUserSuccess = easyQuestionQuizWithSuccess();

                while (!easyUserSuccess) {

                    easyUserSuccess = easyQuestionQuizWithSuccess();

                }

            }

            else if(difficulty.equals("Hard") || difficulty.equals("hard")){

                boolean hardUserSuccess = hardQuestionQuizWithSuccess();

                while (!hardUserSuccess) {

                    hardUserSuccess = hardQuestionQuizWithSuccess();

                }

            }

            else{

                System.out.println("C'mon buddy, choose a real option here. Lets try again.");

                intro();

            }

        }

        private static boolean easyQuestionQuizWithSuccess()

        {

            score = 0;

            int listSize =  VocabTerm.GetListSize();

            for(int i = listSize - 1 ; i >=0 ; i--){

                easyMode(i);

                //System.out.println(VocabTerm.getWordNames().size());

            }

            System.out.println("Your score is " + (getScore()));

            if(VocabTerm.getWordNames().isEmpty()){

                System.out.println("Congratulations, you are a vocab master!");

                return true;

            }

            else{

                //System.out.println(VocabTerm.getWrongListNames());

                System.out.println("Do you want to review incorrect cards?");

                String review = reader.nextLine();

                if(review.equals("Yes")||review.equals("yes")){

                    return false;

                } else {

                    System.out.println("Shame on you for not wanting to correct your mistakes!");

                    return true;

                }

            }

        }

        private static boolean hardQuestionQuizWithSuccess()

        {

            score = 0;

            int listSize =  VocabTerm.GetListSize();

            for(int i = listSize - 1 ; i >=0 ; i--){

                hardMode(i);

                //System.out.println(VocabTerm.getWordNames().size());

            }

            System.out.println("Your score is " + (getScore()));

            if(VocabTerm.getWordNames().isEmpty()){

                System.out.println("Congratulations, you are a vocab master!");

                return true;

            }

            else{

                //System.out.println(VocabTerm.getWrongListNames());

                System.out.println("Do you want to review incorrect cards?");

                String review = reader.nextLine();

                if(review.equals("Yes")||review.equals("yes")){

                    return false;

                } else {

                    System.out.println("Shame on you for not wanting to correct your mistakes!");

                    return true;

                }

            }

        }



        public static void scoreCounter(){

            score +=1 ;

        }

        public static int getScore(){

            return score;

        }



        public static void easyMode(int ctr){

            int count = VocabTerm.GetChoiceOptionsSize() - 1;

            VocabTerm rand = vocabList.get(ctr);

            String define = VocabTerm.getDefinition(ctr);

            System.out.println(define);

            System.out.println("Choose the correct word for this definition: " + "\n");

            for (int i = 0; i <= 2; i++) {

                int counter = (int) (Math.random() * count);

                while(VocabTerm.getMultipleChoiceOptions(counter) == null){

                    counter = (int) (Math.random() * (count));

                }

                if(counter == ctr){

                    counter = (int) (Math.random() * (count));

                }

                System.out.println(VocabTerm.getMultipleChoiceOptions(counter));

            }

            System.out.println(VocabTerm.getWord(ctr));

            String answer = reader.nextLine();

            if(answer.equals(VocabTerm.getWord(ctr))){

                scoreCounter();

                System.out.println("Congrats, you got the question correct!" + "\n");

                VocabTerm.setWordNames(ctr);

                VocabTerm.setWordDefinitions(ctr);

            }

            else{

                System.out.println("Sorry, you got it wrong, you will see this word again!" + "\n");

                //VocabTerm.addWrongListNames(VocabTerm.getWord(count));

                //VocabTerm.addWrongListDefinitions(VocabTerm.getDefinition(count));

                //System.out.println(VocabTerm.getWrongListNamesList.size());

            }

        }

        public static void hardMode(int ctr){

            VocabTerm rand = vocabList.get(ctr);

            String define = VocabTerm.getDefinition(ctr);

            System.out.println(define);

            System.out.println("Type the correct word for this definition: ");

            String answer = reader.nextLine();

            if(answer.equals(VocabTerm.getWord(ctr))){

                scoreCounter();

                System.out.println("Congrats, you got the question correct!" + "\n");



                VocabTerm.setWordNames(ctr);

                VocabTerm.setWordDefinitions(ctr);



                if(VocabTerm.getWordNames().isEmpty()){

                    System.out.println("Congratulations on finishing the game!");

                }

            }

            else{

                System.out.println("Sorry, you got it wrong, you will see this word again!");

            }

        }



        public static void makeVocabs(){

            for(int i = 0; i < VocabTerm.GetListSize(); i++){

                VocabTerm vocabSlide = new VocabTerm(VocabTerm.getWordNames().get(i), VocabTerm.getWordDefinitions().get(i));

                vocabList.add(vocabSlide);

            }

        }

    }


