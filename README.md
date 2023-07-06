# CalPolyPomonaWelcome

In this repository I am demonstrating a non-working example of QA testing for automation testing and selenium.


Within this in order to execute I would configure TestNG and modify the JDK settings in order to execute. I would like to note that within this JDK settings there are a plethora of boxes to fill but for reference VM options would be one of the top configurations to set since it is important in order for the automation to work an example will look like something below:

-VM Options:
-Dscreensize.type="Desktop"
-﻿Ddata. type="Live"
﻿-Dauthentication.mode="Desktop"
﻿-Dexecution.type="Browser"
﻿-DLanguage. type="English"
﻿-Denv.resources="resources/*type of environment*"
﻿-Dcucumber. filter. tags=" (@CPP_1)"
﻿-Dproject.module.name-"CPPWELCOMEPAGE"

After running maven, we would also wait for a successful build then procceed to TestNG configurationa and run the specific test ID in order to test the gherkin steps/automation scripts. After clicking run on the IDE we will watch the automation test executing. 

If the test is not executing steps to debug would go as follows for me:

Steps to debug:
-Check VM Options(check it has all correct configurations and also the JDK Settings)
-Check gherking step and also make sure the automation step matches the step
-Check if .java file with automation script is written correctly
-Check if locator is the correct x-path
-Execute once more in case everything is correct and it is not a system issue(tends to happen)
-Build maven again, make sure project is building successfully and not failing
-Dont give up!
