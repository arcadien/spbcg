# spbcg
Sample profile based code generator using Eclipse technologies:
* Papyrus UML for profile and model
* Obeo's Acceleo technology for code generation

The profile models three stereotypes for Component UML element, and one for Class UML element.
The model implements three Components and one Class, just to test the stereotype usage in code generation.
The Generator generates one file per UML element, containing names of all its applied stereotypes.

## Methodology
 
### UML Profile
* Create a 'test' UML profile in profile/
* Define the profile URI
* Create an EMF generator using the .uml file of the profile
* Generate model code from the EMF generator

### UML Model
* Create a 'test' UML model in model/
* Apply the 'test' profile on the 'test' model
* Create elements and apply stereotypes

### Setup a generation
* Target gen-target folder
* Use the 'test' UML model as source

### Conclusion
* Execute generation
* Ensure stereotypes are printed in output files

#### IT DOES NOT WORK

