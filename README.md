# LibertyToOpenShiftInstantOn

This project contains a simple Servlet that can be deployed to OpenShift for testing purposes.

It comprises the following components:

| Artifact | Description |
| :--- | :--- |
| LibertyToOpenShiftInstantOn.war | The test application .war file  |
| server.xml | Open Liberty server.xml file |
| Containerfile.olp.slim.java17 | Docker or podman build file using Open Liberty 'slim' with Java 17 |
| deploy.yaml | OpenShift deployment file |
| deploy_incorrectly_placed_in_spec.yaml | A sample invalid deploy file  |
| deploy_incorrectly_placed_SA_in_spec.yaml | A sample invalid deploy file  |
| scc-cap-cr-full-details-dont-use-1.yaml | An OpenShift SCC file containing more details that required |
| scc-cap-cr-full-details-dont-use-2.yaml | An OpenShift SCC file containing more details that required |
| scc-cap-cr-minmal.yaml | An OpenShift SCC file containing the minimum details |

