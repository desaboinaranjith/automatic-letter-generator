import java.time.LocalDate;
import java.util.Scanner;

public class LetterGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = LocalDate.now().toString(); // Format: yyyy-MM-dd

        System.out.println("Which type of letter do you want:");
        System.out.println("1) Leave Letter\n2) Resignation Letter\n3) Covering Letter\n4) Request Letter\n5) Complaint Letter");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1 -> {
                System.out.println("Leave Letter Selected. Please enter the required data...");
                System.out.print("Enter your name: ");
                String name = capitalize(sc.nextLine());
                System.out.print("Enter your college name: ");
                String college = sc.nextLine().toUpperCase();
                System.out.print("Year of study (I/II/III/IV): ");
                String year = sc.nextLine().toUpperCase();
                System.out.print("Enter your branch: ");
                String branch = sc.nextLine().toUpperCase();
                System.out.print("Section: ");
                String section = sc.nextLine().toUpperCase();
                System.out.print("Roll number: ");
                String rollno = sc.nextLine().toUpperCase();
                System.out.print("Reason for leave (sick/ceremony): ");
                String reason = sc.nextLine().toUpperCase();
                System.out.print("Number of days: ");
                String days = sc.nextLine().toUpperCase();
                System.out.print("To whom is the letter addressed: ");
                String letterTo = sc.nextLine().toUpperCase();

                System.out.printf("""
                        From
                        %s
                        %s
                        %s

                        TO
                        %s
                        %s
                        %s

                        Dear Sir/Madam,

                        I %s studying in %s-%s-%s having roll number %s am suffering from %s.
                        I will not be able to attend the classes for %s days. Please accept this request and kindly grant me leave.

                        I am hopeful that you accept my request and sanction me the leaves.

                        Thanking you,
                        Yours Obediently,
                        %s

                        Signature
                        %s
                        """, name, branch, college, letterTo, branch, college, name, year, branch, section, rollno, reason, days, name, today);
            }

            case 2 -> {
                System.out.println("Resignation Letter Selected. Please enter the required data...");
                System.out.print("Name: ");
                String name = capitalize(sc.nextLine());
                System.out.print("Address: ");
                String address = capitalize(sc.nextLine());
                System.out.print("City: ");
                String city = capitalize(sc.nextLine());
                System.out.print("State ZIP Code: ");
                String zip = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Date: ");
                String date = sc.nextLine();
                System.out.print("Manager Name: ");
                String manager = capitalize(sc.nextLine());
                System.out.print("Company Name: ");
                String company = capitalize(sc.nextLine());
                System.out.print("Company Address: ");
                String companyAddress = capitalize(sc.nextLine());
                System.out.print("Job Title: ");
                String job = capitalize(sc.nextLine());

                System.out.printf("""
                        %s
                        %s
                        %s
                        %s
                        %s
                        %s

                        %s
                        %s
                        %s

                        Dear %s,

                        I am writing to inform you that I am resigning from my position as %s at %s. My last day of work will be %s.

                        I would like to express my appreciation for the opportunities you have provided me during my tenure at %s. I have learned a lot from my colleagues and have enjoyed working with the team.
                        However, after careful consideration, I have decided that it is time for me to move on to new challenges and opportunities.

                        I assure you that I will do everything possible to ensure a smooth transition during my remaining time at the company. I will complete all of my pending work and assist in training a replacement, if needed.

                        Please let me know how I can help to make this transition as smooth as possible.

                        Sincerely,
                        %s
                        """, name, address, city, zip, email, date, manager, company, companyAddress, manager, job, company, date, company, name);
            }

            case 3 -> {
                System.out.println("Covering Letter Selected. Please enter the required data...");
                System.out.print("Your Name: ");
                String name = capitalize(sc.nextLine());
                System.out.print("Address: ");
                String address = capitalize(sc.nextLine());
                System.out.print("City: ");
                String city = capitalize(sc.nextLine());
                System.out.print("State ZIP: ");
                String zip = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Date: ");
                String date = sc.nextLine();
                System.out.print("Recipient Name: ");
                String recipient = capitalize(sc.nextLine());
                System.out.print("Company Name: ");
                String company = capitalize(sc.nextLine());
                System.out.print("Company Address: ");
                String companyAddress = capitalize(sc.nextLine());
                System.out.print("Company ZIP: ");
                String compZip = sc.nextLine();
                System.out.print("Job Title: ");
                String job = capitalize(sc.nextLine());
                System.out.print("Years of Experience: ");
                String exp = sc.nextLine();
                System.out.print("Related Field: ");
                String field = capitalize(sc.nextLine());
                System.out.print("Current Job Title: ");
                String currentJob = capitalize(sc.nextLine());
                System.out.print("Current Company: ");
                String currentComp = capitalize(sc.nextLine());
                System.out.print("Key Skills: ");
                String skills = capitalize(sc.nextLine());
                System.out.print("Achievements: ");
                String achievements = capitalize(sc.nextLine());
                System.out.print("Company Accomplishments: ");
                String accomplishments = capitalize(sc.nextLine());

                System.out.printf("""
                        %s
                        %s
                        %s
                        %s
                        %s
                        %s

                        %s
                        %s
                        %s
                        %s

                        Dear %s,

                        I am writing to apply for the position of %s at %s. With %s years of experience in %s, I am confident that I have the skills and expertise to excel in this role.

                        In my current position as %s at %s, I have gained extensive experience in %s. My achievements in this role include %s.

                        I am excited about the opportunity to bring my skills and experience to %s and contribute to the success of the team. I am particularly impressed by %s.
                        """, name, address, city, zip, email, date, recipient, company, companyAddress, compZip, recipient, job, company, exp, field, currentJob, currentComp, skills, achievements, company, accomplishments);
            }

            case 4 -> {
                System.out.println("Request Letter Selected. Please enter the required data...");
                System.out.print("Your Name: ");
                String name = capitalize(sc.nextLine());
                System.out.print("Address: ");
                String address = capitalize(sc.nextLine());
                System.out.print("City: ");
                String city = capitalize(sc.nextLine());
                System.out.print("State ZIP: ");
                String zip = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Date: ");
                String date = sc.nextLine();
                System.out.print("Recipient Name: ");
                String recipient = capitalize(sc.nextLine());
                System.out.print("College Name: ");
                String college = capitalize(sc.nextLine());
                System.out.print("College Address: ");
                String collegeAddress = capitalize(sc.nextLine());
                System.out.print("College City: ");
                String collegeCity = capitalize(sc.nextLine());
                System.out.print("College State ZIP: ");
                String collegeZip = sc.nextLine();
                System.out.print("Degree Program: ");
                String degree = capitalize(sc.nextLine());
                System.out.print("Graduation Year: ");
                String gradYear = sc.nextLine();
                System.out.print("Reason for Certificate: ");
                String reason = capitalize(sc.nextLine());

                System.out.printf("""
                        %s
                        %s
                        %s
                        %s
                        %s
                        %s

                        %s
                        %s
                        %s
                        %s
                        %s

                        Subject: Request for Certificate

                        Dear %s,

                        I am writing this letter to request a certificate from %s. I completed my %s from %s in %s.

                        I require the certificate for %s. I would be grateful if you could issue the certificate as soon as possible.

                        Please let me know if there is any additional information or documentation required to process my request.

                        Thank you for your attention to this matter.

                        Sincerely,
                        %s
                        """, name, address, city, zip, email, date, recipient, college, collegeAddress, collegeCity, collegeZip, recipient, college, degree, college, gradYear, reason, name);
            }

            case 5 -> {
                System.out.println("Complaint Letter Selected. Please enter the required data...");
                System.out.print("Your Name: ");
                String name = capitalize(sc.nextLine());
                System.out.print("Address: ");
                String address = capitalize(sc.nextLine());
                System.out.print("City: ");
                String city = capitalize(sc.nextLine());
                System.out.print("ZIP Code: ");
                String zip = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Date: ");
                String date = sc.nextLine();
                System.out.print("Recipient Name: ");
                String recipient = capitalize(sc.nextLine());
                System.out.print("Govt. Office Name: ");
                String office = capitalize(sc.nextLine());
                System.out.print("Govt. Office Address: ");
                String officeAddress = capitalize(sc.nextLine());
                System.out.print("Office City: ");
                String officeCity = capitalize(sc.nextLine());
                System.out.print("Office ZIP Code: ");
                String officeZip = sc.nextLine();
                System.out.print("Complaint Topic: ");
                String topic = capitalize(sc.nextLine());
                System.out.print("Issue: ");
                String issue = capitalize(sc.nextLine());

                System.out.printf("""
                        %s
                        %s
                        %s
                        %s
                        %s
                        %s

                        %s
                        %s
                        %s
                        %s
                        %s

                        Subject: Complaint Regarding %s

                        Dear %s,

                        I am writing this letter to bring to your attention the issue of %s. I am a citizen/student/employee of %s, and I believe that this issue has a significant impact on my personal/professional/academic life.

                        Despite my attempts to address the issue, the problem has persisted. I would like to file a formal complaint and request your assistance in resolving this matter.

                        Thank you for your attention to this matter.

                        Sincerely,
                        %s
                        """, name, address, city, zip, email, date, recipient, office, officeAddress, officeCity, officeZip, topic, recipient, issue, office, name);
            }

            default -> System.out.println("Invalid option. Please select from 1 to 5.");
        }

        sc.close();
    }

    private static String capitalize(String input) {
        return input.length() > 1 ? input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase() : input.toUpperCase();
    }
}
