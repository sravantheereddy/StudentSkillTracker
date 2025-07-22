package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Sravanthee");
        Random rand = new Random();

        for (int day = 1; day <= 7; day++) {
            int codeHrs = rand.nextInt(4);      // 0–3 hours
            int aptiHrs = rand.nextInt(3);      // 0–2 hours
            int gitCommits = rand.nextInt(5);   // 0–4 commits

            s.addCodingHours(codeHrs);
            s.addAptitudeHours(aptiHrs);
            s.addGitCommits(gitCommits);

            System.out.println("Day " + day + " ➜ Coding: " + codeHrs + " | Aptitude: " + aptiHrs + " | Git: " + gitCommits);
        }

        System.out.println("\n📊 Final Weekly Progress:");
        s.printProgress();
    }
}
