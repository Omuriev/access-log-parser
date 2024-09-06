import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int filePathCounter = 0;

        while (true)
        {
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
                System.out.println("Путь указан верно");
            }

            System.out.println("Это файл номер - " + filePathCounter);
        }
    }
}
