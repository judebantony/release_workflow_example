# DevX Cloud-Based IDE and GitHub Action

This sample projet is to demostrate DevX by using an integrated cloud-based IDE for feature delopment and e2e SDLC release workflow process.

#### Tools used are listed below ####

* Requirements & Planning
  * [JIRA](https://judebantony.atlassian.net)
* Devlopment
  * [VSCode](https://code.visualstudio.com/)
  * [CodeSpaces](https://codespace.io/)
  * [GitPod](https://gitpod.io/)
  * [CoPilot](https://copilot.app/)
* Language used
  * [Spring Boot](https://spring.io/projects/spring-boot)
  * [Java](https://www.java.com/en/)
* SCM
  * [GitHub](https://github.com)
* Build
  * [Mavan](https://maven.apache.org)  
* Continuous Integration
  * [Github Action](https://github.com/features/actions)
* Code Quality
  * [SonarQube](https://sonarcloud.io/organizations/judebantony/projects)
  * [Codecov](https://codecov.io/gh/judebantony/cicd-github-action-example/commit/4b9f0f601ab2feee0e409ede57283d5b99b9182d/build)
* SAST (Static Analysis Security Testing)
  * [CodeQL](https://docs.github.com/en/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-with-codeql)
* SCA (Software Composition Analysis)
  * [Dependabot](https://github.blog/2020-06-01-keep-all-your-packages-up-to-date-with-dependabot/)
* DAST (Dynamic Application Security Testing)
  * [OWASP ZAP](https://www.zaproxy.org)
* OpenAPI Spec Validator
  * [Swagger Editor Validator](https://swagger.io/blog/api-design/validate-openapi-definitions-swagger-editor/)  
* Infra as Code Scan
  * [Snyk](https://snyk.io)
  * [OPA](https://www.openpolicyagent.org)
* Secret Scan
  * [Trufflehog](https://github.com/trufflesecurity/truffleHog)
  * [GitGuardian](https://dashboard.gitguardian.com/workspace/190186/analytics)
* Maven Repository
  * [Github Package](https://github.com/trufflesecurity/truffleHog)
* Unit Testing
  * [Junit](https://junit.org/junit5/)
  * [Jacoco](https://www.baeldung.com/sonarqube-jacoco-code-coverage)
* Functional Testing
  * [Cucumber](https://cucumber.io)
  * [Selenium](https://www.selenium.dev)
  * [LamdaTest](https://www.lambdatest.com)
* Test Management
  * [Xray & Jira for Test Execution](https://docs.getxray.app/display/XRAY/About+Xray)
  * [Katalon](https://testops.katalon.io/)
* Performance Testing
  * [K6](https://k6.io)
* Create Release Note & Tag

## IDE ##

An integrated development environment is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of at least a source code editor, build automation tools and a debugger. We are using [Gitpod](https://gitpod.io/), [CodeSpaces](https://github.com/features/codespaces) & [VSCode](https://code.visualstudio.com) as an integrated development environment. We are using [CoPilot](https://github.com/features/copilot) for AI based code completion.

* [CodeSpaces](https://github.com/features/codespaces)
    * CodeSpaces is a cloud-based IDE that is backed by high performance VMs that start in seconds..
* [VSCode](https://code.visualstudio.com)
* [Gitpod](https://gitpod.io/)
    * Spin up fresh, automated dev environments for each task, in the cloud, in seconds.
* [CoPilot](https://github.com/features/copilot)
    * GitHub Copilot uses the OpenAI Codex to suggest code and entire functions in real-time, right from your editor. 

CoPilot is a powerful AI-powered code completion engine that can be used to provide code completion suggestions for any language. It is a powerful tool that can be used to help you write better code, and it is a great way to learn new languages.
![copilot](./doc/copilot.png)
## Plugins ##
plugins provide productivity-boosting capabilities within your favorite Integrated Development Environments (IDEs).
VSCode plugins are available in the [marketplace](https://marketplace.visualstudio.com/vscode).
Some of the pligins used are listed below.

* [GitHub Actions](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-actions)
* [CodeSpace](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-codespace)
* [CoPilot](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-copilot)
* [GitHub](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github)
* [GitHub Package](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-package)
* [Jira](https://marketplace.visualstudio.com/items?itemName=Atlassian.atlascode)
* [SonarQube](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonar-vscode)
* [CodeQL](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-codeql)
* [Dependabot](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-dependabot)
* [DAST](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-dast)
* [OpenAPI Spec Validator](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-openapi-spec-validator)
* [Cucumber](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-cucumber)
* [LamdaTest](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-lambdatest)

## Linting ##

Lint, or a linter, is a static code analysis tool used to flag programming errors, bugs, stylistic errors and suspicious constructs. We are using [SonarLint](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarlint-vscode),[BlackDuckLint](https://sig-docs.synopsys.com/codesight/topics/installation_guides/vscode/c_code_sight_vscode_ig_welcome.html) as a linter. It is a code analysis tool that analyzes code for errors, smells, and other problems. It is integrated with the IDE to detect changes in the code.

![sonarlint](./doc/sonarlint.png)
![gitlint](./doc/gitlint.png)

## Jira and Github Integration - (Planning,Requirement & Test Execution) ##

Jira and Github Integration will provide better traceability between Planning, Requirement, Code, Build and Test Execution.  [Linking your GitHub to Jira](https://support.atlassian.com/jira-cloud-administration/docs/integrate-with-github/) gives team the ability to see their branches, commit messages, build, test cases & results, pull requests and release information in the context of Jira tickets. More information can find [here.](https://github.blog/2018-10-04-announcing-the-new-github-and-jira-software-cloud-integration/). [VSCode](https://code.visualstudio.com) is integrated with Jira and Github using plugins, it is availbale in the [marketplace](https://marketplace.visualstudio.com/vscode).

Developer can see all the issues in the Jira in the IDE itself.
![jira](./doc/jira.png)

When a developer makes a commit, they should add a Jira issue key to the commit message as shown below:

![commitingcode](./doc/commitingcode.png)

Then GitHub Commit information would appear in Jira as shown below.
![jiragithub](./doc/jiragithub.png)

Once GitHub Action build is completed, build information get reflected in Jira as shown below.

![githubbuild](./doc/githubbuild.png)

Using [Cucumber](https://cucumber.io) & [Gherkin](https://cucumber.io/docs/gherkin/), we can add Test Plan & Test Cases to a specific story in Jira.

```java
Feature: Test Swagger UI
  Scenario: Swagger UI successful 

    Given user wants to check google search
    When user goes to google search using "LamdaTest"
    Then user should see google search
```

![githubtest](./doc/githubtest.png)

Test results will be uploaded back to Jira to provide [Requirement Traceability Matrix](https://www.tutorialspoint.com/software_testing_dictionary/requirements_traceability_matrix.htm)

![githubtest](./doc/githubtestrun.png)
![githubresult](./doc/githubresult.png)

## Start the development by cloning the repository ##

Clone the repository using [VSCode](https://code.visualstudio.com) [GitHub plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github).
![clonetherepo](./doc/clonetherepo.png)
![selecttherepoforcloning](./doc/selecttherepoforcloning.png)

## Create a Jira Tasks ##

Create Jira task and assigne to the devloper for development using [VSCode](https://code.visualstudio.com) [Jira plugin](https://marketplace.visualstudio.com/items?itemName=Atlassian.atlascode).
![create_jira_issue](./doc/create_jira_issue.png)

## Start working on it ##

* Start working on the Jira task by create feature branch using [VSCode](https://code.visualstudio.com) [Jira plugin](https://marketplace.visualstudio.com/items?itemName=Atlassian.atlascode).
![startwork](./doc/startwork.png)
![creatingbranch](./doc/creatingbranch.png)

* Switch to the new branch.
![switchtobranch](./doc/switchtobranch.png)

* Start developing the code using [VSCode](https://code.visualstudio.com) and [CoPilot](https://github.com/features/copilot).
![copilot](./doc/copilot.png)

* Commit the changes and push to the remote repository.
![commitingcode](./doc/commitingcode.png)

* Once the code is committed, build the code using [GitHub Action](https://github.com/features/actions). Github Action log can be found in the IDE. The plugin used for this is [GitHub Action](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-action).

![githubactionlogs](./doc/githubactionlogs.png)
![githubbuild](./doc/githubbuild.png)
If you want to update any github action configuration then you can do it using [VSCode](https://code.visualstudio.com) [GitHub Action](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-action).
![updategithubaction](./doc/updategithubaction.png)

* Run the unit tests and capture the result in Jira using Xray.
![githubtest](./doc/githubtest.png)

Test results will be uploaded back to Jira to provide [Requirement Traceability Matrix](https://www.tutorialspoint.com/software_testing_dictionary/requirements_traceability_matrix.htm)

![githubtest](./doc/githubtestrun.png)
![githubresult](./doc/githubresult.png)

* Once we are done with the development of the task, we can create a pull request to the main branch. Pull request can be created using [VSCode](https://code.visualstudio.com) [GitHub plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github).
![createpullrequest](./doc/createpullrequest.png)
![createdpullrequestgit](./doc/createdpullrequestgit.png)

* Once the pull request is created, we can merge the pull request to the main branch. Merge can be done using [VSCode](https://code.visualstudio.com) [GitHub plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github).
![managepullrequest](./doc/managepullrequest.png)
![unittestresult](./doc/unittestresult.png)
![unittestcoverage](./doc/unittestcoverage.png)






















## Author

* **Jude Antony**
[![Linkedin](https://i.stack.imgur.com/gVE0j.png) LinkedIn](https://www.linkedin.com/in/jude-antony-2b208219/)
&nbsp;
[![GitHub](https://i.stack.imgur.com/tskMh.png) GitHub](https://github.com/judebantony)

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details
