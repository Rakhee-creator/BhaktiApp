

///Salute to James Gosling ,Father of Java 🙏👑🔥
import java.util.Scanner;
public class BhaktiApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🌺 Jai Bhakti App 🌺");
        System.out.println("Choose your path to Bhakti:");
        System.out.println("1. Lord Ganesh Stotram");
        System.out.println("2. Ganapati Atharvashirsha");
        System.out.println("3. Sadashiv Ashtakam");
        System.out.println("4. Krishnaashtakam");
        System.out.println("5. Surya Mantra");
        System.out.println("Enter your choice (1–5):");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("🔊 Playing: Ganesh Stotram https://youtu.be/fENu5kCRQ8U?si=nheaTjzTAizs3Gvz");
                System.out.println("प्रणम्य शिरसा देवं गौरीपुत्रं विनायकम ☀");
                break;

            case 2:
                System.out.println("🔊 Playing: Ganapati Atharvashirsha https://youtu.be/VpATv_6pCPE?si=bBjziPCBFItqAqZ");
                System.out.println("ॐ नमस्ते गणपतय! त्वमेव केवलं कर्तासि। त्वमेव केवलं धर्तासि। त्वमेव केवलं हर्तासिॐ नमस्ते गणपतये। त्वमेव प्रत्यक्षं तत्वमसि।");
                break;

            case 3:
                System.out.println("🔊 Playing: Sadashiv Ashtakam.https://youtu.be/R4QU8GvtwKk?si=PFnGNFUVmxATN8N7");
                System.out.println("सदा नमशिवाय ते सदा शिवाय शम्भवे !.");
                break;

            case 4:
                System.out.println("🔊 Playing: Krishna Ashtakam.https://youtu.be/GQm8a75W2q0?si=_zN9aWnzRj-L3N41");
                System.out.println("भजे व्रजैक मण्डनम्, समस्त पाप खण्डनम्,");
                break;

            case 5:
                System.out.println("🔊 Playing: Surya Mantra.https://youtu.be/nJrYlcOAJdI?si=knHafs-mfRSOdMQZ.");
                System.out.println("ॐ जपाकुसुमसंकाशं काश्यपेयं महाद्युतिम् तमोरिं सर्वपापघ्नं प्रणतोस्मि दिवाकरम्.");
                break;

            default:
                System.out.println("🙏 Invalid choice. Please enter a number between 1 and 5.");
        }

        System.out.println("🛕 Thank you for visiting Bhakti Console! Jai Ganesha!");
    }
}


