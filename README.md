# DevX & E2E Release Management

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/judebantony/release_workflow_example)

[![Main Branch](https://github.com/judebantony/release_workflow_example/actions/workflows/release.yml/badge.svg)](https://github.com/judebantony/release_workflow_example/actions/workflows/release.yml)




# DevX - Cloud-Based IDE, JIRA and GitHub Action

This sample project is to demonstrate DevX - using an integrated cloud-based IDE for feature development, GitHub Action for CI/CD and JIRA for E2E Release Management.

A positive developer experience can bring multiple benefits. Some of them are:

* Departments collaborate better – open and transparent communication and trust between developers and other departments lead an organization to function well as a unit.
* Productivity increases – providing good DX is one of the best ways to increase productivity within a dev team. Among other things, this means allowing developers to focus on the day-to-day work of building the products without any distractions.
* Time-to-market is faster – because of increased developer productivity, work is done more efficiently. It speeds up the process of launching new products or new features on the market.
* Motivation increases – providing an excellent developer experience gives the team the ability to solve interesting problems. They tackle interesting cases, develop their skills and work on their personal growth. When they are closer to the end customer, they feel more connected to the company’s mission.
* Duplications and overhead are eliminated – working on good DX is a great way to eliminate bottlenecks in the development process and eliminate unnecessary tooling.
* The team is more productive – because of the good DX, the team is more productive. This means that the team is more efficient and more efficient means that the team is more efficient.

Integrated development environments, or IDEs, are software platforms that provide programmers and developers a comprehensive set of tools for software development in a single product. IDEs are built to work with specific application platforms and remove barriers involved in the lifecycle of software development.

#### The tools used are listed below ####

* Requirements & Planning
  * [JIRA](https://judebantony.atlassian.net)
* Development
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
* SAST (Static Analysis Security Testing)
  * [CodeQL](https://docs.github.com/en/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-with-codeql)
* SCA (Software Composition Analysis)
  * [Dependabot](https://github.blog/2020-06-01-keep-all-your-packages-up-to-date-with-dependabot/)
* Secret Scan
  * [Trufflehog](https://github.com/trufflesecurity/truffleHog)
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
* CI/CD
  * [GitHub Actions](https://github.com/features/actions)  
* Release Management
  * [Jira](https://judebantony.atlassian.net)
  * [GitHub Action](https://github.com/features/actions)


## IDE ##

An integrated development environment is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of at least a source code editor, build automation tools and a debugger. Here we use [Gitpod](https://gitpod.io/), [CodeSpaces](https://github.com/features/codespaces) & [VSCode](https://code.visualstudio.com) as an integrated development environment and [CoPilot](https://github.com/features/copilot) for AI-based code completion.

* [CodeSpaces](https://github.com/features/codespaces)
    * CodeSpaces is a cloud-based IDE that is backed by high performance VMs that start in seconds..
* [VSCode](https://code.visualstudio.com)
    * VSCode is a free and open-source software development platform that is built upon the Microsoft Visual Studio code editor.
* [Gitpod](https://gitpod.io/)
    * Spin up fresh, automated dev environments for each task, in the cloud, in seconds.
* [CoPilot](https://github.com/features/copilot)
    * GitHub Copilot uses the OpenAI Codex to suggest code and entire functions in real-time, right from your editor. 

CoPilot is a powerful AI-powered code completion engine that can be used to provide code completion suggestions for any language. It is a powerful tool that helps you write better code, and it is a great way to learn new languages. In the below image, we can see CoPilot suggests a code snippet for the language of our choice.
![copilot](./doc/copilot.png)

Using [Gitpod](https://gitpod.io/), we can to spin up a fresh dev environment for each task, in the cloud and will be able to open the IDE in the browser.
![gitpod](./doc/gitpod.png)

## Plugins ##
Plugins provide productivity-boosting capabilities within your favorite Integrated Development Environments (IDEs).
VSCode plugins are available in the [marketplace](https://marketplace.visualstudio.com/vscode).
Some of the plugins used are listed below.

* [GitHub Actions](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-actions)
* [CodeSpaces](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-codespace)
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

Lint, or a linter, is a static code analysis tool used to flag programming errors, bugs, stylistic errors and suspicious constructs. We use [SonarLint](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarlint-vscode), [BlackDuckLint](https://sig-docs.synopsys.com/codesight/topics/installation_guides/vscode/c_code_sight_vscode_ig_welcome.html) as a linter. It is a code analysis tool that analyzes code for errors, smells, and other problems. It is integrated with the IDE to detect changes in the code.

This guarantees the development team to “[shift left](https://www.devsecops.org/blog/2016/5/20/-security)” application security at the earliest stages in the development lifecycle, as part of DevSecOps (a collaboration between development, security, and operations). To shift left means to move a process to the left on the traditional linear depiction of the software development lifecycle (SDLC). There are two common subjects of shift left initiatives in DevSecOps (security and testing).
SonarLint is a linter that is integrated with the IDE to detect code quality.
![sonarlint](./doc/sonarlint.png)
GitLint is a linter that is integrated with the IDE to detect changes in the code.
![gitlint](./doc/gitlint.png)

## Jira and Github Integration - (Planning,Requirement & Test Execution) ##

Jira and Github Integration will provide better traceability between Planning, Requirement, Code, Build and Test Execution.  [Linking your GitHub to Jira](https://support.atlassian.com/jira-cloud-administration/docs/integrate-with-github/) gives the team the ability to see their branches, commit messages, build, test cases & results, pull requests and release information in the context of Jira tickets. More information can find [here.](https://github.blog/2018-10-04-announcing-the-new-github-and-jira-software-cloud-integration/). [VSCode](https://code.visualstudio.com) is integrated with Jira and Github using plugins, it is available in the [marketplace](https://marketplace.visualstudio.com/vscode).

The developer can see all the issues in the Jira in the IDE itself.
![jira](./doc/jira.png)

When a developer makes a commit, they should add a Jira issue key to the commit message as shown below:

![commitingcode](./doc/commitingcode.png)

Then GitHub Commit information would appear in Jira as shown below.
![jiragithub](./doc/jiragithub.png)

Once GitHub Action build is completed, build information gets reflected in Jira as shown below.

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

Test results will be uploaded back to Jira to provide the [Requirement Traceability Matrix](https://www.tutorialspoint.com/software_testing_dictionary/requirements_traceability_matrix.htm)

![githubtest](./doc/githubtestrun.png)
![githubresult](./doc/githubresult.png)

## Feature-Driven Development ##

Feature-driven development is an iterative and incremental software development process. It is a lightweight or Agile method for developing software. FDD blends several industry-recognized best practices into a cohesive whole. These practices are driven from a client-valued functionality perspective.

To provide better developer experience and to reduce the time to develop a new feature, the developer shoud be able to perform all his/her task in the IDE itself. The developers normally focus on the following aspects using the IDE for every feature development:

## 1. Cloning the repository ##

Clone the repository using [VSCode](https://code.visualstudio.com) [GitHub plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github).
![clonetherepo](./doc/clonetherepo.png)
![selecttherepoforcloning](./doc/selecttherepoforcloning.png)

## 2. Create a Jira Ticket ##

Create Jira task and assign to the developer for development using [VSCode](https://code.visualstudio.com) [Jira plugin](https://marketplace.visualstudio.com/items?itemName=Atlassian.atlascode).
![create_jira_issue](./doc/create_jira_issue.png)

## 3. Start working on the ticket/task ##

* Start working on the Jira task by creating a feature branch using [VSCode](https://code.visualstudio.com) [Jira plugin](https://marketplace.visualstudio.com/items?itemName=Atlassian.atlascode).
![startwork](./doc/startwork.png)
![creatingbranch](./doc/creatingbranch.png)

* Switch to the new branch.
![switchtobranch](./doc/switchtobranch.png)

* Start developing the code using [VSCode](https://code.visualstudio.com) and [CoPilot](https://github.com/features/copilot).
![copilot](./doc/copilot.png)

* Commit the changes and push them to the remote repository.
![commitingcode](./doc/commitingcode.png)

* Once the code is committed, build the code using [GitHub Action](https://github.com/features/actions). Github Action log can be found in the IDE. The plugin used for this is [GitHub Action](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-action).

![githubactionlogs](./doc/githubactionlogs.png)
![githubbuild](./doc/githubbuild.png)
If you want to update any github action configuration then you can do it using [VSCode](https://code.visualstudio.com) [GitHub Action](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github-action).
![updategithubaction](./doc/updategithubaction.png)

* Run the unit tests and capture the result in Jira using Xray.
![githubtest](./doc/githubtest.png)

Test results will be uploaded back to Jira to provide the [Requirement Traceability Matrix](https://www.tutorialspoint.com/software_testing_dictionary/requirements_traceability_matrix.htm)

![githubtest](./doc/githubtestrun.png)
![githubresult](./doc/githubresult.png)

* Once we are done with the development of the task, we can create a pull request to the main branch. Pull requests can be created using [VSCode](https://code.visualstudio.com) [GitHub plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github).
![createpullrequest](./doc/createpullrequest.png)
![createdpullrequestgit](./doc/createdpullrequestgit.png)

* Merge the pull request to the main branch after the peer review. Merge can be done using [VSCode](https://code.visualstudio.com) [GitHub plugin](https://marketplace.visualstudio.com/items?itemName=ms-vscode.vscode-github).
![managepullrequest](./doc/managepullrequest.png)
![unittestresult](./doc/unittestresult.png)
![unittestcoverage](./doc/unittestcoverage.png)


## Continuous Integration & SLSA ##

Integration & Implementation of E2E CI/CD release workflow using [Github Action](https://github.com/features/actions), this has been achieved using different Cloud SaaS tools listed below.

[Supply chain Levels for Software Artifacts, or SLSA (salsa)](https://slsa.dev) is a security framework, a check-list of standards and controls to prevent tampering, improve the integrity, and secure packages and infrastructure in your projects, businesses or enterprises. It’s how you get from being safe enough to be as resilient as possible, at any link in the chain.

E2E github action workflow, we implemented has got a combination of CI/CD and SLSA.
![githubactionworkflow](./doc/githubactionworkflow.png)

### 1. Maven - Build and Unit Test ###

[Apache Maven](https://maven.apache.org) is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

Code is built using [Maven](https://maven.apache.org) and unit test cases are executed using [JUnit](https://junit.org/junit5/)
The test coverage result, which is aggregated by [Jacoco](https://www.baeldung.com/sonarqube-jacoco-code-coverage) would be uploaded to [Github Action](https://github.com/features/actions) as artifacts. Please check [pom.xml](https://github.com/judebantony/cicd-github-action-example/tree/main/pom.xml) as well.

```yaml

  test:
    name: Build and Unit Test
    runs-on: ubuntu-latest
    
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK
        uses: actions/setup-java@v1
        with:
          java-version: 1.8
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2     
      - name: Build
        run: mvn -B clean package -DskipTests
      - name: Run UnitTest and Verify 
        run: mvn -B verify -DexcludedGroups="Smoke | LamdaTest"
      - name: Generate JaCoCo Badge
        id: jacoco
        uses: cicirello/jacoco-badge-generator@v2
      - name: Log code coverage percentage
        run: |
          echo "coverage = ${{ steps.jacoco.outputs.coverage }}"
          echo "branch coverage = ${{ steps.jacoco.outputs.branches }}"
      - name: Upload code coverage report
        uses: actions/upload-artifact@v2
        with:
          name: jacoco-report
          path: target/site/jacoco/
      - name: Adding Junit Report
        uses: ashley-taylor/junit-report-annotations-action@master
        if: always()
        with:
          access-token: ${{ secrets.GITHUB_TOKEN }}          
      - name: Publish Unit Test Results
        uses: EnricoMi/publish-unit-test-result-action/composite@v1
        with:
           files: target/surefire-reports/*.xml

```

In [pom.xml](https://github.com/judebantony/release_workflow_example/tree/main/pom.xml), we need to add the jacoco plugin.

```xml
   <plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.7</version>
    <executions>
     <execution>
      <goals>
       <goal>prepare-agent</goal>
      </goals>
     </execution>
     <execution>
      <id>generate-code-coverage-report</id>
      <phase>test</phase>
      <goals>
       <goal>report</goal>
      </goals>
     </execution>
    </executions>
   </plugin>

```

Sample test result:-
![unittest](./doc/unittest.png)

### 2. SonarQube Cloud - Code Quality ###

[SonarQube](https://www.sonarqube.org) is an open-source platform developed by SonarSource for continuous inspection of code quality to perform automatic reviews with static analysis of code to detect bugs, code smells, and security vulnerabilities on 20+ programming languages.

Inspect the code using [SonarQube](https://www.sonarqube.org) and enable the Quality Gate Check-in CI/CD workflow.
Results are uploaded to [SonarQube](https://www.sonarqube.org) Cloud SaaS offering. GitHub integration with SonarQube can find [here](https://docs.sonarqube.org/latest/analysis/github-integration/).

```yaml
  sonar:
    name: Inspect & Quality Gate check - Using Sonar
    runs-on: ubuntu-latest
    needs: [test]
    
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK 11
        uses: actions/setup-java@v1
        with:
          java-version: 11
      - name: Cache SonarCloud packages
        uses: actions/cache@v1
        with:
          path: ~/.sonar/cache
          key: ${{ runner.os }}-sonar
          restore-keys: ${{ runner.os }}-sonar
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2     
      - name: Build and analyze
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
        run: mvn -B verify -DexcludedGroups="Smoke | LamdaTest" org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.issuesReport.html.enable=true -Dsonar.projectKey=judebantony_release_workflow_example
      - name: SonarQube Quality Gate check
        uses: sonarsource/sonarqube-quality-gate-action@master
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}   
        timeout-minutes: 5     
        with:
          scanMetadataReportFile: target/sonar/report-task.txt  

```

In [pom.xml](https://github.com/judebantony/release_workflow_example/tree/main/pom.xml), we need to add the below configuration.

```xml
  <sonar.organization>judebantony</sonar.organization>
  <sonar.projectKey>release_workflow_example</sonar.projectKey>
  <sonar.host.url>https://sonarcloud.io</sonar.host.url>

```

SonarQube dashbord:-
![sonar](./doc/sonar.png)
Quality Gate Check:-
![qualitygate](./doc/qulitygate.png)

### 3. CodeQL - SAST ###

[CodeQL](https://codeql.github.com) is the code analysis engine developed by GitHub to automate security checks. You can analyze your code using CodeQL and display the results as code scanning alerts.

Use the native Github Action [CodeQL](https://codeql.github.com) for SAST scan and upload the result to [GitHub Advanced Security](https://github.com/security) tab. Configuring CodeQL code scanning can find [here](https://docs.github.com/en/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/configuring-code-scanning).

```yaml
  codeqlScan:
      name: SAST Scan using CodeQL
      runs-on: ubuntu-latest
      needs: [sonar]
      
      permissions:
        actions: read
        contents: read
        security-events: write
      strategy:
        fail-fast: false
        matrix:
          language: [ 'java' ]
          
      steps:
      - name: Checkout repository
        uses: actions/checkout@v2
        with:
           fetch-depth: 0
      - name: Initialize CodeQL
        uses: github/codeql-action/init@v1
        with:
          languages: ${{ matrix.language }}
      - name: Autobuild
        uses: github/codeql-action/autobuild@v1
      - name: Perform CodeQL Analysis
        uses: github/codeql-action/analyze@v1

```

GitHub Advanced Security Tab:-
![codeql](./doc/codeql.png)

### 4. Dependabot - SCA ###

Use the github native [Dependabot](https://docs.github.com/en/code-security/supply-chain-security/managing-vulnerabilities-in-your-projects-dependencies/configuring-dependabot-security-updates) for SCA scan and upload the result to [GitHub Advanced Security](https://github.com/security) tab. Enabling the dependabot in GitHub can find [here](https://docs.github.com/en/code-security/supply-chain-security/keeping-your-dependencies-updated-automatically/enabling-and-disabling-dependabot-version-updates).

```yaml

version: 2
updates:
  - package-ecosystem: "maven"
    directory: "/" 
    schedule:
      interval: "daily"
  - package-ecosystem: "docker"
    directory: "/"
    schedule:
      interval: "weekly"

```

Dependabot dashboard:-

![dependabot](./doc/dependabot.png)

### 5. Trufflehog - Secret Scan ###

[Trufflehog](https://trufflesecurity.com/trufflehog) runs behind the scenes to scan your environment for secrets like private keys and credentials, so you can protect your data before a breach occurs.

Use [Trufflehog](https://trufflesecurity.com/trufflehog) to find any secrets present in the source code.

```yaml

 trufflehogScan:
      name: Secret Scan Using Trufflehog
      runs-on: ubuntu-latest
      needs: [codeqlScan]
      
      steps:
        - name: Check out the code
          uses: actions/checkout@v2
          with:
            fetch-depth: 0
        - name: trufflehog-actions-scan
          uses: edplato/trufflehog-actions-scan@master
          with:
            scanArguments: "--regex --entropy=False --max_depth=5"   
```
### 6. Generate SLSA provenance & SBOM ###

[SBOM, or a Software Bill of Materials](https://slsa.dev/blog/2022/05/slsa-sbom). Acting as an “ingredient” label for software, SBOMs are documents that provide a nested list of packages and components included in a piece of software. SBOMs are well positioned to help consumers better manage the risks of the software they consume and to respond more easily to vulnerabilities.

[SLSA (Supply-chain Levels for Software Artifacts)](https://slsa.dev/blog/2022/05/slsa-sbom), a framework for creating a secure software supply chain, can address each of these potential areas for improvement when used in conjunction with SBOMs. This blog post explains the strengths of SBOMs and SLSA and how they fundamentally differ, and shows how SLSA principles can both support the generation of high-quality SBOMs and help consumers respond to supply chain attacks.

```yaml

   slsa:
    name: Generate SLSA provenance
    runs-on: ubuntu-latest
    needs: [trufflehogScan]

    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK
        uses: actions/setup-java@v1
        with:
          java-version: 1.8
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2     
      - name: Build
        run: mvn -B clean package -DskipTests
      - name: Run UnitTest and Verify 
        run: mvn -B verify -DexcludedGroups="Smoke | LamdaTest"
      - name: Generate provenance
        uses: slsa-framework/github-actions-demo@v0.1
        with:
          artifact_path: target/releasegithubaction.jar      
      - name: Upload provenance
        uses: actions/upload-artifact@v2
        with:
          name: slsa-provenance
          path: build.provenance
      - uses: anchore/sbom-action@v0
        with:
          artifact-name: sbom.spdx.json
          format: spdx-json
          path: target
```

Sample SBOM:- [sbom](https://github.com/judebantony/release_workflow_example/tree/main/doc/sbom.spdx.json)
Sample SLSA Provenance:- [slsa](https://github.com/judebantony/release_workflow_example/tree/main/doc/buid.provenance)
### 7. GitHub Package - Publish Artifact(jar) ###

[Github Packages](https://docs.github.com/en/packages/learn-github-packages/introduction-to-github-packages) is a software package hosting service that allows you to host your software packages privately or publicly and use packages as dependencies in your projects.

Publish the Jar to [Github Packages](https://docs.github.com/en/packages/learn-github-packages/introduction-to-github-packages).

```yaml

 gitHubPakageArtifactPush:
    name: Publish Artifact to GitHub Package
    runs-on: ubuntu-latest 
    needs: [slsa] 
    
    permissions: 
      contents: read
      packages: write 
      
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK 8
        uses: actions/setup-java@v1
        with:
          java-version: 1.8
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2
      - name: Publish package
        run: mvn --batch-mode deploy -DskipTests
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}   


```

In [pom.xml](https://github.com/judebantony/release_workflow_example/tree/main/pom.xml), we need to add the below configuration.

```xml
 <distributionManagement>
  <repository>
   <id>github</id>
   <name>GitHub Packages</name>
   <url>https://maven.pkg.github.com/judebantony/release_workflow_example</url>
  </repository>
 </distributionManagement>

```

GitHub Package UI:-
![githubpackage](./doc/githubpackage.png)

### 8. Functional Test using Xray and Jira ###

[XRay](https://www.getxray.app) is a Test Management tool integrated with Jira. Built for every member of your team to plan, test, track and release great software · Manage all your tests as Jira issues.

Xray Jira plugin is used to create the test case in [Gherkin](https://cucumber.io/docs/gherkin/) and [Cucumber](https://cucumber.io) for each Jira story and executed as part of CI/CD pipeline(GitHub Action). The result is uploaded back to Jira. XRay Test Execution config file is present [here](https://github.com/judebantony/cicd-github-action-example/tree/main/testexec_cloud_template.json).

```yaml

  jiraXrayTest:
    name: Functional Test using Xray and Jira 
    runs-on: ubuntu-latest
    needs: [uatdeploy]
        
    steps:
      - name: Check out the code
        uses: actions/checkout@v1
        with:
          fetch-depth: 0
      - name: Set up JDK
        uses: actions/setup-java@v1
        with:
          java-version: 1.8
      - name: Cache Maven packages
        uses: actions/cache@v1
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2    
      - name: Get Xray Cloud API token
        env:
          CLIENT_ID: ${{ secrets.XRAY_CLIENT_ID }}  
          CLIENT_SECRET: ${{ secrets.XRAY_CLIENT_SECRET }}
        id: xray-token
        run: |
          echo ::set-output name=XRAY_TOKEN::$(curl -H "Content-Type: application/json" -X POST --data "{ \"client_id\": \"$CLIENT_ID\",\"client_secret\": \"$CLIENT_SECRET\" }" https://xray.cloud.xpand-it.com/api/v1/authenticate| tr -d '"')
      - name: Get Features from XRAY 
        shell: bash
        run: |
           curl -H "Content-Type: application/json" --output ./features.zip -X GET -H "Authorization: Bearer ${{ steps.xray-token.outputs.XRAY_TOKEN }}"  "https://xray.cloud.xpand-it.com/api/v1/export/cucumber?keys=JUDE-43"
           unzip -o features.zip -d ./src/test/resources/com/jba/ci/bdd/   
      - name: Build
        run: mvn -B clean package -DskipTests
      - name: Run UnitTest and Verify 
        run: mvn -B verify -DexcludedGroups="Smoke | LamdaTest"
      - name: Generate JaCoCo Badge
        id: jacoco
        uses: cicirello/jacoco-badge-generator@v2
      - name: Log code coverage percentage
        run: |
          echo "coverage = ${{ steps.jacoco.outputs.coverage }}"
          echo "branch coverage = ${{ steps.jacoco.outputs.branches }}"
      - name: Upload to XRAY 
        shell: bash
        run: |
           curl  -X POST -H "Authorization: Bearer ${{ steps.xray-token.outputs.XRAY_TOKEN }}" -F info=@testexec_cloud_template.json -F results=@"target/cucumber-reports/cucumber.json" "https://xray.cloud.xpand-it.com/api/v1/import/execution/cucumber/multipart"          

```

Jira Xray test execution dashboard:-
![xray](./doc/xray.png)
### 9. Release Tag Creation ###

Create a release tag for the branch.

```yaml

  releaseTag:
      name: Release Tag & Note Creation 
      runs-on: ubuntu-latest
      needs: [gitHubPakageArtifactPush]
      steps:
        - name: Checkout
          uses: actions/checkout@v2
          with:
            fetch-depth: 0
        - name: Bump version and push tag
          id: tag_version
          uses: anothrNick/github-tag-action@1.26.0
          env:
            GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
            WITH_V: true
      
        - name: Build Changelog
          id: github_release
          uses: mikepenz/release-changelog-builder-action@v1
          env:
            GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
  
        - name: Create Release
          uses: actions/create-release@v1
          with:
            tag_name: ${{ steps.tag_version.outputs.new_tag }}
            release_name: Release ${{ steps.tag_version.outputs.new_tag }}
            body: ${{steps.github_release.outputs.changelog}}
          env:
            GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}  

```

Release Tag:-
![releasetag](./doc/releasetag.png)


## Release Management ##

According to Wikipedia, release management is the process of managing, planning, scheduling and controlling a software build through different stages and environments; it includes testing and deploying software releases. It ensures that release teams efficiently deliver the applications and upgrades required by the business while maintaining the integrity of the existing production environment.

Release management flow using [JIRA](https://community.atlassian.com/t5/Marketplace-Apps-Integrations/Release-Management-is-the-next-big-thing-for-Atlassian-Jira/ba-p/1348276) and Confluence consists of several steps:


### 1. Create a version for the next release ###

Create a version in JIRA using the [Semantic Versioning 2.0.0](https://semver.org) 

Given a version number MAJOR.MINOR.PATCH, increment the:

MAJOR version when you make incompatible API changes
MINOR version when you add functionality in a backwards compatible manner
PATCH version when you make backward-compatible bug fixes
Additional labels for pre-release and build metadata are available as extensions to the MAJOR.MINOR.PATCH format.

![createversion](./doc/createversion.png)
![versionpanal](./doc/versionpanal.png)

### 2. Assigning the tasks to the versions ###

We use the Sprint board with various status columns to move the ticket throughout its lifecycle.
The version should be assigned to the ticket while changing the status into “Awaiting release” on the Sprint board. It means that the feature was well-tested, merged to the “release” branch, and is waiting to be released (deployed to the needed non-prod environment).

![sprintboard](./doc/sprintboard.png)
### 3. Tracking releases ###
The release may contain the tasks with different statuses (e.g. “In progress”, “Reopened” or even “Closed”). JIRA will not allow you to release the version until the team completes all the tasks or remove the task from the current release.
The “release” branch should contain all the required features to be delivered under the current release. All the tasks on the Scrum board should be in “Closed” status.

![release](./doc/release.png)

If there is any warning or error will be shown in this tab.
![warning](./doc/warning.png)

Warning or error can be configured using this tab. 
![managewarning](./doc/managewarning.png)

### 4. Capture the evidences ###

Capture all necessary evidence including [Testing reports - Jira Xray](https://marketplace.atlassian.com/apps/1211769/xray-test-management-for-jira?tab=overview&hosting=cloud), Security reports, [Code coverage reports](https://marketplace.atlassian.com/apps/1217471/sonarqube-connector-for-jira?tab=overview&hosting=cloud), etc. on the Jira release page.

A test management solution helps software teams by addressing all the necessary functions needed to achieve faster and efficient testing, including test planning, creation, execution, and reporting. It makes it easier for organizations to manage and gain insights on a wide variety of tests, ranging from automation, manual, API, to unit tests.

A test management tool provides two-way traceability reports that helps teams assess the appropriate test coverage and allows them to track relevant quality metrics, so they can closely check on the release progress and identify bottlenecks early on. This is especially important when organizations have multiple, globally distributed testing teams, as it gives the managers and executive team visibility across the entire testing process and ensure that teams are well aligned on the release goals.

Add-ons like [Zephyr for Jira](https://smartbear.com/blog/test-management-jira-strategies/) or [X-ray for Jira](https://marketplace.atlassian.com/apps/1211769/xray-test-management-for-jira?tab=overview&hosting=cloud), which are internal integrations that live inside the Jira application and add testing functionality.  Test issues can be created, executed, tracked, and reported on just like any other Jira issue in Zephyr or X-Ray for Jira, which has the same look and feel as Jira.

### 5. Reporting releases ###

To release the version in JIRA you can simply click on the “Release” button and set up the release date.

Release not can be reported using the [Release Management Report](https://confluence.xpand-it.com/display/JIRA/Release+Management+Report) plugin.

![jirareleasenote](./doc/jirareleasenote.png)


## Author

* **Jude Antony**
[![Linkedin](https://i.stack.imgur.com/gVE0j.png) LinkedIn](https://www.linkedin.com/in/jude-antony-2b208219/)
&nbsp;
[![GitHub](https://i.stack.imgur.com/tskMh.png) GitHub](https://github.com/judebantony)

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details
