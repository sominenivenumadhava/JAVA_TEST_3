package test3.com;
import java.io.*;

public class DigitalDiary {
    public void writeNote(String fileName, String note) {
        try {
            File file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(note + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("the FIle is not saved: ");
        }
    }

    public void createBackup(String sourceFile, String backupFile) {

        try (
                BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(backupFile))
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error: Could not create backup.");
        }
    }
    public static void main(String[] args) {

        DigitalDiary diary = new DigitalDiary();

        diary.writeNote("my_diary.txt",
                "Entry 1: Today I started learning Java File I/O.");
        diary.writeNote("my_diary.txt",
                "Entry 2: It was a bit confusing, but I'm getting the hang of it.");
        diary.writeNote("my_diary.txt",
                "Entry 3: I successfully created and copied a file!");

        diary.createBackup("my_diary.txt", "diary_backup.txt");
    }
}

