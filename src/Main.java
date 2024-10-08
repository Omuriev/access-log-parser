import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxLineLength = 1024;
        int filePathCounter = 0;
        int numberOfLinesInFile = 0;
        int lengthOfLongestLine = 0;
        int lengthOfShortestLine = 0;

        while (true)
        {
            numberOfLinesInFile = 0;
            lengthOfLongestLine = 0;
            lengthOfShortestLine = 0;

            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory)
            {
                System.out.println("Файла не существует или указан путь к папке, а не файлу");
                continue;
            }
            else if (fileExists)
            {
                filePathCounter++;

                try {
                    FileReader fileReader = new FileReader(path);
                    BufferedReader reader =
                            new BufferedReader(fileReader);
                    String line;
                    String firstLine = "";
                    while ((line = reader.readLine()) != null) {
                        int length = line.length();

                        if (length > maxLineLength)
                            throw new LineLengthException("Превышена максимальная длина строки! Максимальная длина - " + maxLineLength);

                        if(firstLine.isEmpty()) {
                            firstLine = line;
                            lengthOfShortestLine = firstLine.length();
                        }

                        numberOfLinesInFile +=1;

                        if (lengthOfLongestLine < length)
                            lengthOfLongestLine = length;

                        if (lengthOfShortestLine > length)
                            lengthOfShortestLine = length;
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            System.out.println("Это файл номер - " + filePathCounter);
            System.out.println("Общее количество строк в файле - " + numberOfLinesInFile);
            System.out.println("Длина самой короткой строки - " + lengthOfShortestLine);
            System.out.println("Длина самой длиной строки - " + lengthOfLongestLine);
        }
    }
}
