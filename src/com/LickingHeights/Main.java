package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Hgnk's MadLib From Ancient Zargothian Mythology");
        // Phase 1
        String name;
        String thing;
        String pastTenseVerb;
        String job;
        String partner;
        String insult;
        String creatures;
        String characterTrait;
        String disagreeingWord;
        String synonymForSmart;
        String badHabit;
        String time;
        String differentName;
        String separateName;
        String differentJob;
        String differentCharacterTrait;
        String separateJob;
        String troll;
        String triggerMadlib;

        // Phase 2

        Scanner klepto;
        klepto = new Scanner(System.in);

        System.out.println("Please enter a human name.");
        name = klepto.nextLine();

        System.out.println("Thank you. Now please enter a human job.");
        job = klepto.nextLine();

        System.out.println("Your cooperation is astounding, for a lower race. Now please enter a bad habit among humans.");
        badHabit = klepto.nextLine();

        System.out.println("I don't know why you humans consider that bad, but okay. Now please enter a specific amount of time.");
        time = klepto.nextLine();

        System.out.println("You have surprisingly not yet been incinerated by the nuclear missile we launched at your location five minutes ago. Good job! Now please enter a character trait among humans.");
        differentCharacterTrait = klepto.nextLine();

        System.out.println("I SAID A CHARACTER TRAIT, NOT A HGMYTPHKJL TRXZWCTR! UGHHHH...*angrily mumbles in Zargothian*");
        characterTrait = klepto.nextLine();

        System.out.println("Now THAT'S a character trait. Now please enter a very general and universally offensive insult among humans, you uncultered swine!");
        insult = klepto.nextLine();

        System.out.println("Wha-how dare you call me that! I could smite you with a mere blink! Ugh... give me a word or phrase that's used to disagree with other people.");
        disagreeingWord = klepto.nextLine();

        System.out.println("You call that a... what do you call that? Anyway, I need you to please enter a term for someone who helps out their boss/friend/whatever.");
        partner = klepto.nextLine();

        System.out.println("Me cee u now ure Erngish. Vood. Jnow plase entar ae thing.");
        thing = klepto.nextLine();

        System.out.println("Wait, you still use those? You humans haven't found out about GHJKLSDF? Sons of Khaz... anyway, may you please enter a human name different from the one you've already entered?");
        differentName = klepto.nextLine();

        System.out.println("Hey! That's a racial slur back on Zargoth! Ugh, whatever. Just give me a creature here on Earf.");
        troll = klepto.nextLine();
        System.out.println("No, not that one! We're try'n to write a story here! Choose A different one!");
        creatures = klepto.nextLine();

        System.out.println("Perfect! Now, please pick another job that's (preferably) different from the previous one.");
        differentJob = klepto.nextLine();

        System.out.println("That hasn't been robotized yet? Huh. Don't worry, your Madlib is almost complete. Now, gimme a word to describe someone whose brain is larger than the average homo-sapien.");
        synonymForSmart = klepto.nextLine();

        System.out.println("That's the best you could come up with? Huh. Okay, now enter a human name independent from the names you have previously entered.");
        separateName = klepto.nextLine();

        System.out.println("That's... not a good name. In fact, it's a terrible name. Now, please enter a job that is also separate from the previous two jobs.");
        separateJob = klepto.nextLine();

        System.out.println("Last one! To access your version of Hgnk's MadLib, please enter a past-tense verb! ");
        pastTenseVerb = klepto.nextLine();

        System.out.println("Congratulations, inferior being! You have completed your MadLib! Now, please press any key to continue. Enjoy your hilarious monstrosity.");
        triggerMadlib = klepto.nextLine();

        // Phase 3

        System.out.println("Hgnk's MadLib From Ancient Zargothian Mythology");

        System.out.println(name +": This "+ thing + " will be "+ pastTenseVerb+"!");

        System.out.println(differentName +": But, my "+job+", your "+characterTrait+ " "+partner+" believes that a wasting out time with such a "+insult+" may anger "+separateName+
        ", the " +differentJob+" of "+creatures+"!");

        System.out.println(name+": "+disagreeingWord+", my "+differentCharacterTrait+" "+job+", "+separateName+" is not very "+synonymForSmart+". I believe they've been "+badHabit+" for the past few "+time+". "+badHabit+" numbs the brain, I'm afraid.");

        System.out.println(differentName+": Whatever you say "+name+". I swear to you that "+thing+" will be "+pastTenseVerb+"!");



    }

}