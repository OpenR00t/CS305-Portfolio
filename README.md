
# CS305-Portfolio

-   **Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?**

	Artemis financial is a financial consulting company who created financial plans for their customers. specializing in savings, retirment, insurance, and investments. The company was attempting to modernize their soiftware into a secure web-based solution.

-   **What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?**

	  I believe I did well at addressing vulnerabilities within the dependencies and determining the best path forward in mitigating those vulnerabilities. Creating secure software is crucial in delivering a usable end-product. At the end of the day, if a solution is unsecure, it won't be safe to use in the real world. Secure software enables businesses to confidently handle data without massive risk involved.

-   **What about the process of working through the vulnerability assessment did you find challenging or helpful?**

	I found the certificate generation and implementation most challenging. I coudln't get the client to trust the certificate through https despite many attempts.

-   **How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?**

	I approached security layer implemnation by working layer by layer. For example, implementing the certificate before implementing any of the encryption or hashing. In this project, mitigating the vulenrabilities within the dependency was not required. However, in the future this vulnerabilities should be addressed.

-   **How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?**

	The security of the code refactor was determined through manual review as well as through a maven dependency check. To determine whether or not my code refactoring introduced new vulenrabilites, a dependency check was run prior to the refactor, and then once again after. These two resulting reports were then compared against each other to ensure no new vulnerabilites were detected.

-   **What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?**

	Understanding the spring framework in Java should be helpful to develepment in the future. In addition, this class taught me more about encryption and hash methods in addition to vulnerability assessments. 

-   **Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?**

	I feel that this project showcases my ability to adapt to new concepts quickly and to integrate them into a project. Vulnerability assessments, encryption and restful API's in Spring were all new to me in this course and I feel like I implemented them succesfully.
