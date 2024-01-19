import datetime
today="-".join(str(i) for i in [datetime.date.today().day,  datetime.date.today().month, datetime.date.today().year])
letter = int(input("which type of letter you want : \n1) leave letter \n2) resignation letter\n3) covering letter\n4) Request  letter\n5) complaint letter  \n\n\n "))
if letter ==1:
    print("You have choosen option 1....")
    print("Following is the Leave letter, Please enter the required data....")
    name = input("Enter your  name?: \t").capitalize()
    Clg= input("Enter your college name: \t").upper()
    year = input("year of study(I/II/III/IV)?: \t").upper()
    Class= input("Enter your Branch: ").upper()
    sec = input("section: \t").upper()
    rollno = input("Enter your  RollNo: \t").upper()
    reason = input("Enter your reason(sick leave or ceremony leave): ").upper()
    days = input("Enter number of days: ").upper()
    letterTo = input(" Enter for whom your writing this letter to?\t").upper()
    print(f'''
        From
        {name}
        {Class}
        {Clg}

        TO
        {letterTo}
        {Class}
        {Clg}

        Dear Sir/Madam,
                I {name} studying in {year}-{Class}-{sec} having roll number {rollno} am suffering from {reason}.
        I will not be able to attend the classes for {days} days. Please accept this request and kindly grant me leave.\n
        I am hopeful that you accept my request and sanction me the leaves. 

        Thanking you,
        Yours Obediently,
        {name}

        signature
        {today}
        ''')
elif letter == 2:
    print("You have choosen option 2....")
    print("Following is the Resignation letter, Please enter the required data....")
    name = input("Enter your  name?: \t").capitalize()
    address =input("Enter your  address?: \t").capitalize()
    city =input("Enter your  city?: \t").capitalize()
    statecode =input("Enter your  state zipcode?: \t").capitalize()
    email =input("Enter your  mail id?: \t").capitalize()
    Date =input("Enter date?: \t").capitalize()
    ManagerName =input("Enter your manager name?: \t").capitalize()
    CompanyName =input("Enter your company name?: \t").capitalize()
    CompanyAddress =input("Enter your company address?: \t").capitalize()
    JobTitle =input("Enter your  job role?: \t").capitalize()
    print(f'''
        {name}
        {address}
        {city}
        {statecode}
        {email}
        {Date}

        {ManagerName}
        {CompanyName}
        {CompanyAddress}
       

       Dear {ManagerName},

I am writing to inform you that I am resigning from my position as {JobTitle} at {CompanyName}. My last day of work will be {Date}.

I would like to express my appreciation for the opportunities you have provided me during my tenure at {CompanyName}. I have learned a lot from my colleagues and have enjoyed working with the team. However, after careful consideration, I have decided that it is time for me to move on to new challenges and opportunities.

I assure you that I will do everything possible to ensure a smooth transition during my remaining time at the company. I will complete all of my pending work and assist in training a replacement, if needed.

Please let me know how I can help to make this transition as smooth as possible. Once again, thank you for the opportunities you have provided me during my time at {CompanyName}.

Sincerely,

{name}

''')
elif letter == 3:
    print("You have choosen option 3....")
    print("Following is the Covering letter, Please enter the required data....")
    Your_Name =input("Enter your  name?: \t").capitalize()
    Your_Address =input("Enter your  address?: \t").capitalize()
    City =input("Enter your  city name ?: \t").capitalize()
    StateZIPCode =input("Enter your  state zipcode?: \t").capitalize()
    Your_Email =input("Enter your  mail id?: \t").capitalize()
    Date = input("Enter your  date?: \t").capitalize()
    Recipient_Name =input("Enter your recipient name?: \t").capitalize()
    Company_Name =input("Enter your  company name?: \t").capitalize()
    Company_Address =input("Enter your  company address?: \t").capitalize()
    Company_StateZIPCode =input("Enter your  company state zipcode?: \t").capitalize()
    Job_Title =input("Enter your  job role?: \t").capitalize()
    Number_of_Years =input("Enter year of experience?: \t").capitalize()
    related_field =input("Enter your  related field?: \t").capitalize()
    Current_Job_Title =input("Enter  current job role in current comapany?: \t").capitalize()
    Current_Company =input("Enter your  current company name?: \t").capitalize()
    Key_Skills =input("Enter your  key skills?: \t").capitalize()
    achievements =input("Enter your  achievements?: \t").capitalize()
    company_accomplishments = input("Enter your  company_accomplishments that attracted you  ?: \t").capitalize()
 
    
    
    print(f'''
    {Your_Name}
    {Your_Address}
    {City}
    {StateZIPCode}
    {Your_Email}
    {Date}

    {Recipient_Name}
    {Company_Name}
    {Company_Address}
    {Company_StateZIPCode}

    Dear {Recipient_Name},

I am writing to apply for the position of {Job_Title} at {Company_Name}. With {Number_of_Years} years of experience in {related_field}, I am confident that I have the skills and expertise to excel in this role.

In my current position as {Current_Job_Title} at {Current_Company}, I have gained extensive experience in {Key_Skills}. My achievements in this role include {achievements}.

I am excited about the opportunity to bring my skills and experience to {Company_Name} and contribute to the success of the team. I am particularly impressed by {company_accomplishments}.

''')
 
elif letter == 4:
    print("You have choosen option 4....")
    print("Following is the Request letter, Please enter the required data....")
    Your_Name =input("Enter your  name?: \t").capitalize()
    Your_Address =input("Enter your  address?: \t").capitalize()
    City = input("Enter your  city?: \t").capitalize()
    StateZIPCode =input("Enter your  statezipcode?: \t").capitalize()
    Your_Email =input("Enter your  mail id?: \t").capitalize()
    Date =input("Enter date?: \t").capitalize()
    Recipient_Name =input("Enter your recipient name?: \t").capitalize()
    College_Name =input("Enter your  College_Name?: \t").capitalize()
    Address =input("Enter your  college address?: \t").capitalize()
    City =input("Enter your  college city?: \t").capitalize()
    StateZipCode =input("Enter your  college statezipcode?: \t").capitalize()
    Degree_Program =input("Enter your  name of your Degree_Program?: \t").capitalize()
    Year_of_Graduation =input("Enter your Year_of_Graduation   ?: \t").capitalize()
    further_education = input("Enter why you require the certificates?: \t").capitalize()
    print(f'''
     {Your_Name}
     {Your_Address}
     {City}
     {StateZIPCode}
     {Your_Email}
     {Date}

    {Recipient_Name}
    {College_Name}
    {Address}
    {City}
    {StateZipCode}

    Subject: Request for Certificate

    Dear {Recipient_Name},

I am writing this letter to request a certificate from {College_Name}. I completed my {Degree_Program} from {College_Name} in {Year_of_Graduation}.

I require the certificate for {further_education}. I would be grateful if you could issue the certificate as soon as possible .

Please let me know if there is any additional information or documentation required to process my request. I have attached a copy of my academic records for your reference.

Thank you for your attention to this matter. I look forward to hearing from you soon.

Sincerely,

{Your_Name}


Regenerate
''')
elif letter == 5:
    print("You have choosen option 5....")
    print("Following is the compalint letter, Please enter the required data....")
    Your_Name = input("Enter your  name?: \t").capitalize()
    Your_Address = input("Enter your  address?: \t").capitalize()
    City = input("Enter your  city name?: \t").capitalize()
    StateZIPCode = input("Enter your  StateZIPCode?: \t").capitalize()
    Your_Email = input("Enter your  mail id?: \t").capitalize()
    Date = input("Enter  date?: \t").capitalize()
    Recipient_Name = input("Enter your recipient  name?: \t").capitalize()
    Government_Office_Name = input("Enter  Government_Office_Name?: \t").capitalize()
    Address = input("Enter  Government_Office_address?: \t").capitalize()
    City = input("Enter your  city of office?: \t").capitalize()
    StateZIPCode = input("Enter  office StateZIPCode?: \t").capitalize()
    point = input("Enter your  reason for complaint?: \t").capitalize()
    issue = input("Enter the issue ?: \t").capitalize()
    print(f'''
    {Your_Name}
    {Your_Address}
    {City}
    {StateZIPCode}
    {Your_Email}
    {Date}

    {Recipient_Name}
    {Government_Office_Name}
    {Address}
    {City}
    {StateZIPCode}

    Subject: Complaint Regarding {point}

    Dear {Recipient_Name},

I am writing this letter to bring to your attention the issue of {issue}. I am a student/employee/citizen of {Government_Office_Name}, and I believe that this issue has a significant impact on my academic/professional/personal life.

Despite my attempts to address the issue with  relevant authority, such as teacher, supervisor, or official, the problem has persisted, and I have not received a satisfactory resolution. Therefore, I would like to file a formal complaint and request your assistance in resolving this matter.

I would be grateful if you could investigate this issue and take appropriate action to address it. Please keep me informed of the progress of the investigation and any steps taken to resolve the issue.

Thank you for your attention to this matter. I look forward to your prompt response.

Sincerely,
{Your_Name}


''')
else:
    print("please select option from 1 to 5")








    
