## Escuela colombiana de ingenieria Julio Garavito
#### Laboratorio 5 CVDS - MVC PRIMEFACES INTRODUCTION
#### Estudiante: _Nicolás Ariza Barbosa_

#### PARTE I. - JUGANDO A SER UN CLIENTE HTTP
1) Realice una conexión síncrona TCP/IP a través de Telnet alsiguiente servidor:
	- Host:www.escuelaing.edu.co
	- Puerto: 80
    - Teniendo en cuenta los parámetros delcomando telnet:
    ``` telnet HOST PORT ```
    ```
    C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>telnet www.escuelaing.edu.co 80
    Conectandose a www.escuelaing.edu.co ...
    ```
2) Solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP. Asegúrese de presionar ENTER dos veces después de ingresar el comando.
    ```
    GET /sssss/abc.html HTTP/1.0
    Host: www.escuelaing.edu.co
    
    HTTP/1.1 301 Moved Permanently
    Connection: close
    Server: gunicorn
    Date: Wed, 08 Mar 2023 15:18:29 GMT
    Content-Type: text/html; charset=utf-8
    Location: https://www.escuelaing.edu.co/sssss/abc.html
    X-Content-Type-Options: nosniff
    Referrer-Policy: same-origin
    Cross-Origin-Opener-Policy: same-origin
    Via: 1.1 vegur
    
    
    
    Se ha perdido la conexión con el host.
    
    C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
    ```
- **¿Qué codigo de error sale?**
    301 Moved Permantly y significa que el servidor esta haciendo un redireccionamiento, en este caso lo hace moviendo la peticion hacia HTTPS.
- **¿Qué otros códigos de error existen?,¿En qué caso se manejarán?**
    - 1xx se usan para responder que la conexión fue recibida y entendida.
    - 2xx se usan para indicar que la conexion fue exitosa. 
    - 3xx se usan para indicar que se realizara una redirección hacia el recurso solicitado.
    - 4xx se usan para indicar que el usuario cometio un error solicitando el recurso.
    - 5xx se usan para indicar que el servidor ha fallado respondiendo a la solicitud.

3) Realice una nueva conexión con telnet, esta vez a:
    -   Host:www.httpbin.org
    -   Puerto: 80
    -   VersiónHTTP:1.1
    ```
    C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>telnet www.httpbin.org 80
    Conectandose a www.httpbin.org ...
    ```
Ahora,solicite (GET) el recurso /html.¿Qué se obtiene como resultado?
```
GET /html HTTP/1.1
Host:www.httpbin.org

HTTP/1.1 200 OK
Date: Wed, 08 Mar 2023 15:42:08 GMT
Content-Type: text/html; charset=utf-8
Content-Length: 3741
Connection: keep-alive
Server: gunicorn/19.9.0
Access-Control-Allow-Origin: *
Access-Control-Allow-Credentials: true

<!DOCTYPE html>
               <html>
                       <head>
                               </head>
                                        <body>
                                                    <h1>Herman Melville - Moby-Dick</h1>

                                                                                              <div>
                                                                                                           <p>
                                                                                                                        Availing himself of the mild, summer-cool weather that now reigned in these latitudes, and in preparation for the peculiarly active pursuits shortly to be anticipated, Perth, the begrimed, blistered old blacksmith, had not removed his portable forge to the hold again, after concluding his contributory work for Ahab's leg, but still retained it on deck, fast lashed to ringbolts by the foremast; being now almost incessantly invoked by the headsmen, and harpooneers, and bowsmen to do some little job for them; altering, or repairing, or new shaping their various weapons and boat furniture. Often he would be surrounded by an eager circle, all waiting to be served; holding boat-spades, pike-heads, harpoons, and lances, and jealously watching his every sooty movement, as he toiled. Nevertheless, this old man's was a patient hammer wielded by a patient arm. No murmur, no impatience, no petulance did come from him. Silent, slow, and solemn; bowing over still further his chronically broken back, he toiled away, as if toil were life itself, and the heavy beating of his hammer the heavy beating of his heart. And so it was. Ç Most miserable! A peculiar walk in this old man, a certain slight but painful appearing yawing in his gait, had at an early period of the voyage excited the curiosity of the mariners. And to the importunity of their persisted questionings he had finally given in; and so it came to pass that every one now knew the shameful story of his wretched fate. Belated, and not innocently, one bitter winter's midnight, on the road running between two country towns, the blacksmith half-stupidly felt the deadly numbness stealing over him, and sought refuge in a leaning, dilapidated barn. The issue was, the loss of the extremities of both feet. Out of this revelation, part by part, at last came out the four acts of the gladness, and the one long, and as yet uncatastrophied fifth act of the grief of his life's drama. He was an old man, who, at the age of nearly sixty, had postponedly encountered that thing in sorrow's technicals called ruin. He had been an artisan of famed excellence, and with plenty to do; owned a house and garden; embraced a youthful, daughter-like, loving wife, and three blithe, ruddy children; every Sunday went to a cheerful-looking church, planted in a grove. But one night, under cover of darkness, and further concealed in a most cunning disguisement, a desperate burglar slid into his happy home, and robbed them all of everything. And darker yet to tell, the blacksmith himself did ignorantly conduct this burglar into his family's heart. It was the Bottle Conjuror! Upon the opening of that fatal cork, forth flew the fiend, and shrivelled up his home. Now, for prudent, most wise, and economic reasons, the blacksmith's shop was in the basement of his dwelling, but with a separate entrance to it; so that always had the young and loving healthy wife listened with no unhappy nervousness, but with vigorous pleasure, to the stout ringing of her young-armed old husband's hammer; whose reverberations, muffled by passing through the floors and walls, came up to her, not unsweetly, in her nursery; and so, to stout Labor's iron lullaby, the blacksmith's infants were rocked to slumber. Oh, woe on woe! Oh, Death, why canst thou not sometimes be timely? Hadst thou taken this old blacksmith to thyself ere his full ruin came upon him, then had the young widow had a delicious grief, and her orphans a truly venerable, legendary sire to dream of in their after years; and all of them a care-killing competency.
                                              </p>
                                                        </div>
                                                                </body>
                                                                       </html>

Se ha perdido la conexión con el host.

C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
```
4) Claro está, las peticiones GET son insuficientes en muchoscasos. Investigue: 
**¿Cuál es la diferencia entre los verbos GET y POST?** 
    _El metodo GET solicitda al servidor web que le envie toda la informacion de hipertexto que posea en el recurso especificado, mientras que POST es usado para hacer peticiones pero a su vez también es capaz de enviar parametros que el servidor necesita para acceder al recurso solicitado._
**¿Qué otros tipos de peticiones existen?**
    - GET
    - HEAD
    - POST
    - PUT
    - DELETE
    - CONNECT
5) En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos: “curl www.httpbin.org”
    - Utilice ahora el parámetro -v y con el parámetro -i:
        - curl -v www.httpbin.org
        - curl -i www.httpbin.org
        
    **¿Cuáles son las diferencias con los diferentes parámetros?**
    _El parametro -v se denomina "verbose mode" y lo que hace es mostrar informacion sobre el proceso de conexion con el destino sobre la marcha. Por otro lado, el parametro -i se usa para hacer seguimiento a los headers de problemas que retorne el servidor al que se le hace la solicitud._
#### PARTE II. -HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJO NIVEL.
1) Cree un proyecto maven nuevo usando el arquetipo de aplicación Web estándar **maven-archetype-webapp**.
```
C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Servlet -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeGroupId=org.apache.maven.archetypes
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] >>> archetype:3.2.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< archetype:3.2.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- archetype:3.2.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] Archetype [org.apache.maven.archetypes:maven-archetype-webapp:1.4] found in catalog remote
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-webapp/1.4/maven-archetype-webapp-1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-webapp/1.4/maven-archetype-webapp-1.4.pom (1.4 kB at 11 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-webapp/1.4/maven-archetype-webapp-1.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-webapp/1.4/maven-archetype-webapp-1.4.jar (6.8 kB at 253 kB/s)
[INFO] Using property: groupId = edu.eci.cvds
[INFO] Using property: artifactId = Servlet
Define value for property 'version' 1.0-SNAPSHOT: :
[INFO] Using property: package = edu.eci.cvds
Confirm properties configuration:
groupId: edu.eci.cvds
artifactId: Servlet
version: 1.0-SNAPSHOT
package: edu.eci.cvds
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: maven-archetype-webapp:1.4
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: edu.eci.cvds
[INFO] Parameter: artifactId, Value: Servlet
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: edu.eci.cvds
[INFO] Parameter: packageInPathFormat, Value: edu/eci/cvds
[INFO] Parameter: package, Value: edu.eci.cvds
[INFO] Parameter: groupId, Value: edu.eci.cvds
[INFO] Parameter: artifactId, Value: Servlet
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\Servlet
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  22.428 s
[INFO] Finished at: 2023-03-08T09:03:29-05:00
[INFO] ------------------------------------------------------------------------

C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
```
2) Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven.
```

C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn package
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< edu.eci.cvds:Servlet >------------------------
[INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.3.1/maven-war-plugin-3.3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.3.1/maven-war-plugin-3.3.1.pom (8.8 kB at 9.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.3.1/maven-war-plugin-3.3.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.3.1/maven-war-plugin-3.3.1.jar (82 kB at 859 kB/s)
[INFO]
[INFO] --- dependency:2.6:copy (default) @ Servlet ---
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ Servlet ---
[INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ Servlet ---
[INFO] No sources to compile
[INFO]
[INFO] --- resources:3.3.0:testResources (default-testResources) @ Servlet ---
[INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ Servlet ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.0.0-M8:test (default-test) @ Servlet ---
[INFO] No tests to run.
[INFO]
[INFO] --- war:3.3.1:war (default-war) @ Servlet ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.5.0/maven-archiver-3.5.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.5.0/maven-archiver-3.5.0.pom (4.5 kB at 178 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.2.0/plexus-archiver-4.2.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.2.0/plexus-archiver-4.2.0.pom (4.8 kB at 269 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.19/commons-compress-1.19.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.19/commons-compress-1.19.pom (18 kB at 675 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.25/plexus-interpolation-1.25.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.25/plexus-interpolation-1.25.pom (2.6 kB at 106 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.pom (4.1 kB at 143 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/22/maven-shared-components-22.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/22/maven-shared-components-22.pom (5.1 kB at 116 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.5.0/maven-archiver-3.5.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.5.0/maven-archiver-3.5.0.jar (26 kB at 370 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.jar (11 kB at 100 kB/s)
[INFO] Packaging webapp
[INFO] Assembling webapp [Servlet] in [C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\Servlet-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Copying webapp resources [C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\webapp]
[INFO] Building war: C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\Servlet-1.0-SNAPSHOT.war
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.464 s
[INFO] Finished at: 2023-03-08T19:23:40-05:00
[INFO] ------------------------------------------------------------------------

C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
```
```
C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn tomcat7:run
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< edu.eci.cvds:Servlet >------------------------
[INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] >>> tomcat7:2.2:run (default-cli) > process-classes @ Servlet >>>
[INFO]
[INFO] --- dependency:2.6:copy (default) @ Servlet ---
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ Servlet ---
[INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ Servlet ---
[INFO] No sources to compile
[INFO]
[INFO] <<< tomcat7:2.2:run (default-cli) < process-classes @ Servlet <<<
[INFO]
[INFO]
[INFO] --- tomcat7:2.2:run (default-cli) @ Servlet ---
[INFO] Running war on http://localhost:8080/
[INFO] Using existing Tomcat server configuration at C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\tomcat
[INFO] create webapp with contextPath:
mar. 08, 2023 8:46:37 P.áM. org.apache.coyote.AbstractProtocol init
INFO: Initializing ProtocolHandler ["http-bio-8080"]
mar. 08, 2023 8:46:37 P.áM. org.apache.catalina.core.StandardService startInternal
INFO: Starting service Tomcat
mar. 08, 2023 8:46:37 P.áM. org.apache.catalina.core.StandardEngine startInternal
INFO: Starting Servlet Engine: Apache Tomcat/7.0.47
mar. 08, 2023 8:46:39 P.áM. org.apache.catalina.util.SessionIdGenerator createSecureRandom
INFO: Creation of SecureRandom instance for session ID generation using [SHA1PRNG] took [109] milliseconds.
mar. 08, 2023 8:46:39 P.áM. org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-bio-8080"]
```
3) Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá
como host ‘localhost’, como puerto el configurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/pageTest.png)

4) Observe que el Servlet ‘SampleServlet’ acepta peticiones GET, y opcionalmente, lee el parámetro ‘name’. Ingrese la misma URL, pero ahora agregando un parámetro GET.

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/getRequest.png)

5) Busque el artefacto gson en el repositorio de maven y agregue la dependencia.
    ```
    <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10.1</version>
        </dependency>
      </dependencies>
    ```
6) En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/consultaUno.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/consultaDos.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/consultaTres.png)

7) Basado en la respuesta que le da el servicio del punto anterior, cree la clase edu.eci.cvds.servlet.model.Todo con un constructor vacío y los métodos getter y setter para las propiedades de los"To Dos" que se encuentran en la url indicada.
    ```
    package edu.eci.cvds.servlet.model;
    
    public class Todo{
    	private int uId;
    	private int id;
    	private String title;
    	private boolean completed;
    	
    	public Todo(){
    	}
    	
    	public int getUserId(){
    		return uId;
    	}
    	
    	public int getId(){
    		return id;
    	}
    	
    	public String getTitle(){
    		return title;
    	}
    	
    	public boolean getCompleted(){
    		return completed;
    	}
    	
    	public void setUserId(int newUserId){
    		this.uId = newUserId;
    	}
    	
    	public void setId(int newId){
    		this.id = newId;
    	}
    	
    	public void setTitle(String newTitle){
    		this.title = newTitle;
    	}
    	
    	public void setCompletedState(boolean newCompletedState){
    		this.completed = newCompletedState;
    	}
    }
    ```
8) Cree una clase que herede de la claseHttpServlet (similar a SampleServlet), y para la misma sobrescriba el método heredado doGet. Incluya la anotación @Override para verificar –en tiempo de compilación- que efectivamente se esté sobreescribiendo un método de las superclases.
    ```
    package edu.eci.cvds.servlet;
    	import java.io.IOException;
    	import java.io.Writer;
    	import java.util.Optional;
    	import javax.servlet.ServletException;
    	import javax.servlet.annotation.WebServlet;
    	import javax.servlet.http.HttpServlet;
    	import javax.servlet.http.HttpServletRequest;
    	import javax.servlet.http.HttpServletResponse;
    	
    	@WebServlet(
    		urlPatterns = "/accessToServlet"
    	)
    	
    	public class LabServlet extends HttpServlet{
    		
    		@Override
    		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    			
    		}
    }
    ```
    ```
    C:\Users\nicolas.ariza\Documents\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn compile
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -------------------------< edu.eci.cvds:Lab5 >--------------------------
    [INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
    [INFO] --------------------------------[ war ]---------------------------------
    [INFO]
    [INFO] --- maven-dependency-plugin:2.6:copy (default) @ Lab5 ---
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Lab5 ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory C:\Users\nicolas.ariza\Documents\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
    [INFO]
    [INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ Lab5 ---
    [INFO] Changes detected - recompiling the module!
    [INFO] Compiling 4 source files to C:\Users\nicolas.ariza\Documents\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\classes
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  1.943 s
    [INFO] Finished at: 2023-03-11T08:51:15-05:00
    [INFO] ------------------------------------------------------------------------
    
    C:\Users\nicolas.ariza\Documents\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
    ```
9) Teniendo en cuenta las siguientes métodos disponibles en los objetos ServletRequest y ServletResponse recibidos por el método doGet:
    ```
    package edu.eci.cvds.servlet;
    	import edu.eci.cvds.servlet.model.Todo;
    	import edu.eci.cvds.servlet.Service;
    	import java.util.ArrayList;
    	import java.io.IOException;
    	import java.io.Writer;
    	import java.util.Optional;
    	import javax.servlet.ServletException;
    	import javax.servlet.annotation.WebServlet;
    	import javax.servlet.http.HttpServlet;
    	import javax.servlet.http.HttpServletRequest;
    	import javax.servlet.http.HttpServletResponse;
    	import java.net.MalformedURLException;
    	import java.io.FileNotFoundException;
    	import java.lang.NumberFormatException;
    	
    	@WebServlet(
    		urlPatterns = "/accessToServlet"
    	)
    	
    	public class LabServlet extends HttpServlet{
    		static final long serialVersionUID = 35L;
    		
    		
    		@Override
    		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    			Writer responseWriter = resp.getWriter();
    			Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
    			try{
    				int id = optId.isPresent() && !optId.get().isEmpty() ? Integer.parseInt(optId.get()) : 0;
    				resp.setStatus(HttpServletResponse.SC_OK);
    				ArrayList<Todo> todo = new ArrayList<Todo>();
    				todo.add(Service.getTodo(id));
    				responseWriter.write(Service.todosToHTMLTable(todo));
    			}catch (FileNotFoundException e){
    				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
    				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_NOT_FOUND));
    			}catch (NumberFormatException e){
    				resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_BAD_REQUEST));
    			}catch (Exception e){
    				resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_INTERNAL_SERVER_ERROR));
    			}
    		}
    }
    ```
10) Una vez hecho esto, verifique el funcionamiento de la aplicación, recompile y ejecute la aplicación.
    ```
    C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn package
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -------------------------< edu.eci.cvds:Lab5 >--------------------------
    [INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
    [INFO]   from pom.xml
    [INFO] --------------------------------[ war ]---------------------------------
    [INFO]
    [INFO] --- dependency:2.6:copy (default) @ Lab5 ---
    [INFO]
    [INFO] --- resources:3.3.0:resources (default-resources) @ Lab5 ---
    [INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
    [INFO]
    [INFO] --- compiler:3.8.0:compile (default-compile) @ Lab5 ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO]
    [INFO] --- resources:3.3.0:testResources (default-testResources) @ Lab5 ---
    [INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\test\resources
    [INFO]
    [INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ Lab5 ---
    [INFO] No sources to compile
    [INFO]
    [INFO] --- surefire:3.0.0-M8:test (default-test) @ Lab5 ---
    [INFO] No tests to run.
    [INFO]
    [INFO] --- war:3.3.2:war (default-war) @ Lab5 ---
    [INFO] Packaging webapp
    [INFO] Assembling webapp [Lab5] in [C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\Lab5-1.0-SNAPSHOT]
    [INFO] Processing war project
    [INFO] Building war: C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\Lab5-1.0-SNAPSHOT.war
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  8.207 s
    [INFO] Finished at: 2023-03-14T21:59:13-05:00
    [INFO] ------------------------------------------------------------------------
    
    C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
    ```
    ```
    C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn tomcat7:run
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -------------------------< edu.eci.cvds:Lab5 >--------------------------
    [INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
    [INFO]   from pom.xml
    [INFO] --------------------------------[ war ]---------------------------------
    [INFO]
    [INFO] >>> tomcat7:2.2:run (default-cli) > process-classes @ Lab5 >>>
    [INFO]
    [INFO] --- dependency:2.6:copy (default) @ Lab5 ---
    [INFO]
    [INFO] --- resources:3.3.0:resources (default-resources) @ Lab5 ---
    [INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
    [INFO]
    [INFO] --- compiler:3.8.0:compile (default-compile) @ Lab5 ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO]
    [INFO] <<< tomcat7:2.2:run (default-cli) < process-classes @ Lab5 <<<
    [INFO]
    [INFO]
    [INFO] --- tomcat7:2.2:run (default-cli) @ Lab5 ---
    [INFO] Running war on http://localhost:8080/
    [INFO] Using existing Tomcat server configuration at C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\tomcat
    [INFO] create webapp with contextPath:
    mar. 14, 2023 10:09:39 P.áM. org.apache.coyote.AbstractProtocol init
    INFO: Initializing ProtocolHandler ["http-bio-8080"]
    mar. 14, 2023 10:09:39 P.áM. org.apache.catalina.core.StandardService startInternal
    INFO: Starting service Tomcat
    mar. 14, 2023 10:09:39 P.áM. org.apache.catalina.core.StandardEngine startInternal
    INFO: Starting Servlet Engine: Apache Tomcat/7.0.47
    mar. 14, 2023 10:09:41 P.áM. org.apache.catalina.startup.ContextConfig processAnnotationsJar
    SEVERE: Unable to process Jar entry [META-INF/versions/9/module-info.class] from Jar [jar:file:/C:/Users/Nicolas%20Ariza/.m2/repository/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar!/] for annotations
    org.apache.tomcat.util.bcel.classfile.ClassFormatException: Invalid byte tag in constant pool: 19
            at org.apache.tomcat.util.bcel.classfile.Constant.readConstant(Constant.java:133)
            at org.apache.tomcat.util.bcel.classfile.ConstantPool.<init>(ConstantPool.java:60)
            at org.apache.tomcat.util.bcel.classfile.ClassParser.readConstantPool(ClassParser.java:209)
            at org.apache.tomcat.util.bcel.classfile.ClassParser.parse(ClassParser.java:119)
            at org.apache.catalina.startup.ContextConfig.processAnnotationsStream(ContextConfig.java:2134)
            at org.apache.catalina.startup.ContextConfig.processAnnotationsJar(ContextConfig.java:2010)
            at org.apache.catalina.startup.ContextConfig.processAnnotationsUrl(ContextConfig.java:1976)
            at org.apache.catalina.startup.ContextConfig.processAnnotations(ContextConfig.java:1961)
            at org.apache.catalina.startup.ContextConfig.webConfig(ContextConfig.java:1319)
            at org.apache.catalina.startup.ContextConfig.configureStart(ContextConfig.java:878)
            at org.apache.catalina.startup.ContextConfig.lifecycleEvent(ContextConfig.java:376)
            at org.apache.catalina.util.LifecycleSupport.fireLifecycleEvent(LifecycleSupport.java:119)
            at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:90)
            at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5322)
            at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150)
            at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1559)
            at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1549)
            at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
            at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
            at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
            at java.base/java.lang.Thread.run(Thread.java:833)
    
    mar. 14, 2023 10:09:42 P.áM. org.apache.catalina.util.SessionIdGenerator createSecureRandom
    INFO: Creation of SecureRandom instance for session ID generation using [SHA1PRNG] took [115] milliseconds.
    mar. 14, 2023 10:09:42 P.áM. org.apache.coyote.AbstractProtocol start
    INFO: Starting ProtocolHandler ["http-bio-8080"]
    ```
    
11) Intente hacer diferentes consultas desde un navegador Web para probar las diferentes funcionalidades.

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/ToDo_Consulta1.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/ToDo_Consulta2.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/ToDo_404.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/ToDo_400.png)

#### PARTE III
1) En su servlet, sobreescriba el método doPost, y haga la misma implementación del doGet.
    ```
    @Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			Writer responseWriter = resp.getWriter();
			Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
			try{
				int id = optId.isPresent() && !optId.get().isEmpty() ? Integer.parseInt(optId.get()) : 0;
				resp.setStatus(HttpServletResponse.SC_OK);
				ArrayList<Todo> todo = new ArrayList<Todo>();
				todo.add(Service.getTodo(id));
				responseWriter.write(Service.todosToHTMLTable(todo));
			}catch (FileNotFoundException e){
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_NOT_FOUND));
			}catch (NumberFormatException e){
				resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_BAD_REQUEST));
			}catch (Exception e){
				resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_INTERNAL_SERVER_ERROR));
			}
		}
    ```
2) En la página anterior, cree un formulario que tenga un campo para ingresar un número y un botón. El formulario debe usar como método ‘POST’, y como acción, la ruta relativa del último servletcreado (es decir la URL pero excluyendo ‘http://localhost:8080/’).
    ```
    <!DOCTYPE html>
    <html>
    	<head>
    		<title>Start Page</title>
    		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	</head>
    	<body>
    		<h2>Hello, complete the form to continue...</h2>
    		<form action="/accessToServlet" method="post">
    			Id: <input type="text" name="id" required>
    			<br></br>
    			<input type="submit" value="Submit">
    		</form>
    	</body>
    </html>
    ```
3) Revise este ejemplo de validación de formularios con javascript y agruéguelo a su formulario, de manera que -al momento de hacer ‘submit’- desde el browser se valide que el valor ingresado es un valor numérico.
    ```
    <!DOCTYPE html>
    <html>
    	<head>
    		<title>Start Page</title>
    		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	</head>
    	<body>
    		<script>
    			function validateInt() {
    			  // Get the value of the input field with id="id"
    			  let x = document.getElementById("id").value;
    			  // If x is Not a Number
    			  let text;
    			  if (isNaN(x)) {
    				text = "Input not valid";
    			  } else {
    				text = "Input OK";
    			  }
    			  document.getElementById("demo").innerHTML = text;
    			}
    		</script>
    		
    		<h2>Hello, complete the form to continue...</h2>
    		<form action="/accessToServlet" method="post">
    			Id: <input type="text" name="id" required>
    			<br></br>
    			<input type="submit" value="Submit">
    			<p id="demo"></p>
    		</form>
    	</body>
    </html>
    ```
4) Recompile y ejecute la aplicación. Abra en su navegador en la página del formulario, y rectifique que la página hecha anteriormente sea mostrada. Ingrese los datos y verifique los resultados. 

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formStartPage.png)

_Probamos ingresando en el formulario el valor "90"._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formSample1.png)

_Despues de dar click en el botón "Submit" se redirecciona a la siguiente pagina en respuesta._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formResponse1.png)

_Ingresar un valor erroneo hara que el servidor responda con un mensaje de error._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formSample2.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formResponse2.png)

Cambie el formulario para que ahora en lugar de POST, use el método GET ¿Qué diferencia observa?
```
    <!DOCTYPE html>
    <html>
    	<head>
    		<title>Start Page</title>
    		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	</head>
    	<body>
    		<script>
    			function validateInt() {
    			  // Get the value of the input field with id="id"
    			  let x = document.getElementById("id").value;
    			  // If x is Not a Number
    			  let text;
    			  if (isNaN(x)) {
    				text = "Input not valid";
    			  } else {
    				text = "Input OK";
    			  }
    			  document.getElementById("demo").innerHTML = text;
    			}
    		</script>
    		
    		<h2>Hello, complete the form to continue...</h2>
    		<form action="/accessToServlet" method="post">
    			Id: <input type="text" name="id" required>
    			<br></br>
    			<input type="submit" value="Submit">
    			<p id="demo"></p>
    		</form>
    	</body>
    </html>
```

_Probamos ingresando en el formulario el valor "190"._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formSample3.png)

_Y esta vez observamos que en el espacio de la URL se ha añadido los valores "*?id=190" lo cual no ocurria con el metodo POST._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/formResponse3.png)

#### PARTE IV. - FRAMEWORKS WEB MVC – JAVA SERVER FACES / PRIME FACES
1) Al proyecto Maven, debe agregarle las dependencias masrecientes de javax.javaee-api, com.sun.faces.jsf-api, com.sun.faces.jsf-impl, javax.servlet.jstl y Primefaces (en el archivo pom.xml).
```
<!-- https://mvnrepository.com/artifact/javax/javaee-api -->
	<dependency>
		<groupId>javax</groupId>
		<artifactId>javaee-api</artifactId>
		<version>8.0</version>
		<scope>provided</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-api -->
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-api</artifactId>
        <version>2.2.20</version>
    </dependency>
	
	<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-impl -->
    <dependency>
        <groupId>com.sun.faces</groupId>
        <artifactId>jsf-impl</artifactId>
        <version>2.2.20</version>
    </dependency>
	
	<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>
	
	<!-- https://mvnrepository.com/artifact/org.primefaces/primefaces -->
    <dependency>
        <groupId>org.primefaces</groupId>
        <artifactId>primefaces</artifactId>
        <version>12.0.0</version>
    </dependency>
```
2) Ahora, va a crear un Backing-Bean de sesión, el cual, para cada usuario, mantendrá de lado del servidor las siguientes propiedades: 
    * El número que actualmente debe adivinar (debe ser un número aleatorio).
    * El número de intentos realizados.
    * El premio acumulado hasta el momento.
    * El estado del juego, que sería una cadena de texto que indica si ya ganó o no, y si ganó de cuanto es el premio.

    A la implementación de esta clase, agregue los siguientes métodos:
    - **guess**: Debe recibir un intento de adivinanza y realizar la lógica para sabersise adivinó, de tal forma que se ajuste el valor del premio y/o actualice el estado del juego.
    - **restart**: Debe volver a iniciar el juego (inicializar de nuevo el número a adivinar, y restaurar el premio a su valor original).
    
    ```
    package edu.eci.cvds.servlet;
    
    import java.util.Random;
    import javax.faces.bean.ManagedBean;
    import javax.faces.bean.SessionScoped;
    import javax.faces.bean.ApplicationScoped;
    
    @ManagedBean(name = "guessBean")
    @ApplicationScoped
    public class GuessBean{
    	private int currentNumberGuess;
    	private int attempts;
    	private int prize;
    	private String[] gameStates = new String[]{"Winner of ", "You Loose", "Gotta keep up"};
    	private String gameState;
    	private Random guessNumber = new Random();
    	
    	
    	public GuessBean(){
    		this.gameState = gameStates[2];
    		setPrize(30000);
    		setAttempts(5);
    		setNewNumber();
    	}
    	
    	public void guess(int numberChoosen){
    		this.prize = (numberChoosen == getCurrentGuessNumber()) ?  (getPrize() + 100000) : (getPrize() - 10000);
    		setAttempts(getAttempts() - 1);
    		validateGameState();	
    	}
    	
    	public void reset(){
    		this.gameState = gameStates[2];
    		setPrize(30000);
    		setAttempts(5);
    		setNewNumber();
    	}
    	
    	private void validateGameState(){
    		if (getPrize() <= 0 || getAttempts() <= 0){
    			setGameState("L");
    		}else{
    			setGameState("W");
    		}
    	}
    	
    	public void setNewNumber(){
    		this.currentNumberGuess = guessNumber.nextInt(5)+1;
    	}
    	
    	public void setAttempts(int newAttempts) {
    		this.attempts = newAttempts;
    	}
    	
    	public void setPrize(int newPrize){
    		this.prize = newPrize;
    	}
    	
    	public void setGameState(String newGameState){
    		this.gameState = (newGameState.equals("W")) ? gameStates[0] + getPrize() + "$": gameStates[1];
    	}
    	
    	public int getCurrentGuessNumber(){
    		return currentNumberGuess;
    	}
    	
    	public int getAttempts(){
    		return attempts;
    	}
    	
    	public int getPrize(){
    		return prize;
    	}
    	
    	public String getGameState(){
    		return gameState;
    	}
    }
    ```
3) Cree una página XHTML, de nombre guess.xhtml (debe quedar en la ruta src/main/webapp). Revise en la página 13 del manual de PrimeFaces, qué espacios de nombres XML requiere una página de PrimeFaces y cuál esla estructura básica de la misma. Con base en lo anterior, agregue un formulario con identificador guess_form:
    ```
    <!DOCTYPE html>
    <html>
    	<h:body>
    		<h:form id="guess_form">
    		</h:form>
    	</h:body>
    </html>
    ```
4) Al formulario, agregue:
- Un elemento de tipo <p:outputLabel> para el número que se debe adivinar, sin embargo, este elemento se debe ocultar. Para ocultarlo, se puede agregar el estilo display: none; al elemento. Una forma de hacerlo es por medio de la propiedad style. En una aplicacion real, no se debería tener este elemento, solo se crea con el fin de simplificar una prueba futura.
- Un elemento <p:inputText> para que el usuario ingrese su número.
- Un elemento de tipo <p:outputLabel> para mostrar el número de intentosrealizados.
- Un elemento de tipo <p:outputLabel> para mostrar el estado del juego.
- Un elemento de tipo <p:outputLabel> para mostrar en cuanto va el premio. 

    Y asocie dichos elementos al BackingBean de sesión a través de su propiedad value, y usando como referencia el nombre asignado: value="#{guessBean.nombrePropiedad}"
    ```
    <!DOCTYPE html>
    <html lang="en" xmlns="http://www.w3.org/1999/xhtml"
        xmlns:h="http://java.sun.com/jsf/html"
        xmlns:f="http://java.sun.com/jsf/core"
    	xmlns:p="http://primefaces.org/ui">
    	<h:body>
    		<h:form id="guess_form">
    			<p:outputLabel value="#{guessBean.getCurrentGuessNumber()} style="display:none"/>
    			<h3>Number of attempts left:</h3>
    			<p:outputLabel value="#{guessBean.getAttempts()}"/>
    			<h3>Game state:</h3>
    			<p:outputLabel value="#{guessBean.getGameState()}"/>
    			<h3>Prize value:</h3>
    			<p:outputLabel value="#{guessBean.getPrize()}"/>
    			<h3>Enter a number:</h3>
    			<p:inputText binding="#{number}"/>
    		</h:form>
    	</h:body>
    </html>
    ```
5) Al formulario, agregue dos botones de tipo <p:commandButton>, uno para enviar el número ingresado y ver si se atinó, y otro para reiniciar el juego.
- El botón de envío de adivinanza debe tener asociado a su propiedad update el nombre del formulario en el que se agregaron los campos antes descritos, de manera que al hacer click, se ejecute un ciclo de JSF y se refresque la vista.
- Debe tener también una propiedad actionListener con la cual se le indicará que, al hacer click, se ejecutará el método guess, creado en el backing-bean de sesión: 
<p:commandButton update="guess_form" actionListener="#{guessBean.guess}">...
- El botón de reiniciar juego tendrá las mismas propiedades de update y actionListener del otro con el valor correspondiente: <p:commandButton update="..." actionListener="...">
    ```
    <!DOCTYPE html>
    <html lang="en" xmlns="http://www.w3.org/1999/xhtml"
        xmlns:h="http://java.sun.com/jsf/html"
        xmlns:f="http://java.sun.com/jsf/core"
    	xmlns:p="http://primefaces.org/ui">
    	<h:body>
    		<h:form id="guess_form">
    			<p:outputLabel value="#{guessBean.getCurrentGuessNumber()}" style="display:none"/>
    			<h3>Number of attempts left:</h3>
    			<p:outputLabel value="#{guessBean.getAttempts()}"/>
    			<h3>Game state:</h3>
    			<p:outputLabel value="#{guessBean.getGameState()}"/>
    			<h3>Prize value:</h3>
    			<p:outputLabel value="#{guessBean.getPrize()}"/>
    			<h3>Enter a number:</h3>
    			<p:inputText binding="#{number}"/>
    			<p:commandButton value="Submit" update="guess_form" actionListener="#{guessBean.guess()}">
    			<p:commandButton value="Reset" update="guess_form" actionListener="#{guessBean.reset()}">
    		</h:form>
    	</h:body>
    </html>
    ```
6) Para verificar el funcionamiento de la aplicación, agregue el plugin tomcat-runner dentro de los plugins de la fase de construcción (build). Tenga en cuenta que en la configuración del plugin se indica bajo que ruta quedará la aplicación:
```
C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn package
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------------< edu.eci.cvds:Lab5 >--------------------------
[INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- dependency:2.6:copy (default) @ Lab5 ---
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ Lab5 ---
[INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ Lab5 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\classes
[INFO]
[INFO] --- resources:3.3.0:testResources (default-testResources) @ Lab5 ---
[INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ Lab5 ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.0.0-M8:test (default-test) @ Lab5 ---
[INFO] No tests to run.
[INFO]
[INFO] --- war:3.3.2:war (default-war) @ Lab5 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Lab5] in [C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\Lab5-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Copying webapp resources [C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\webapp]
[INFO] Building war: C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\Lab5-1.0-SNAPSHOT.war
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.183 s
[INFO] Finished at: 2023-03-17T10:22:25-05:00
[INFO] ------------------------------------------------------------------------

C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>
```
```
C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5>mvn tomcat7:run
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------------< edu.eci.cvds:Lab5 >--------------------------
[INFO] Building Servlet Maven Webapp 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] >>> tomcat7:2.2:run (default-cli) > process-classes @ Lab5 >>>
[INFO]
[INFO] --- dependency:2.6:copy (default) @ Lab5 ---
[INFO]
[INFO] --- resources:3.3.0:resources (default-resources) @ Lab5 ---
[INFO] skip non existing resourceDirectory C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ Lab5 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] <<< tomcat7:2.2:run (default-cli) < process-classes @ Lab5 <<<
[INFO]
[INFO]
[INFO] --- tomcat7:2.2:run (default-cli) @ Lab5 ---
[INFO] Running war on http://localhost:8080/
[INFO] Using existing Tomcat server configuration at C:\Users\Nicolas Ariza\Documents\CVDS\LabsCVDS\CVDS-LABORATORIOS-ARIZA-2023-1\Lab5\target\tomcat
[INFO] create webapp with contextPath:
mar. 17, 2023 10:34:25 A.áM. org.apache.coyote.AbstractProtocol init
INFO: Initializing ProtocolHandler ["http-bio-8080"]
mar. 17, 2023 10:34:25 A.áM. org.apache.catalina.core.StandardService startInternal
INFO: Starting service Tomcat
mar. 17, 2023 10:34:25 A.áM. org.apache.catalina.core.StandardEngine startInternal
INFO: Starting Servlet Engine: Apache Tomcat/7.0.47
mar. 17, 2023 10:34:28 A.áM. org.apache.catalina.startup.ContextConfig processAnnotationsJar
SEVERE: Unable to process Jar entry [META-INF/versions/9/module-info.class] from Jar [jar:file:/C:/Users/Nicolas%20Ariza/.m2/repository/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar!/] for annotations
org.apache.tomcat.util.bcel.classfile.ClassFormatException: Invalid byte tag in constant pool: 19
        at org.apache.tomcat.util.bcel.classfile.Constant.readConstant(Constant.java:133)
        at org.apache.tomcat.util.bcel.classfile.ConstantPool.<init>(ConstantPool.java:60)
        at org.apache.tomcat.util.bcel.classfile.ClassParser.readConstantPool(ClassParser.java:209)
        at org.apache.tomcat.util.bcel.classfile.ClassParser.parse(ClassParser.java:119)
        at org.apache.catalina.startup.ContextConfig.processAnnotationsStream(ContextConfig.java:2134)
        at org.apache.catalina.startup.ContextConfig.processAnnotationsJar(ContextConfig.java:2010)
        at org.apache.catalina.startup.ContextConfig.processAnnotationsUrl(ContextConfig.java:1976)
        at org.apache.catalina.startup.ContextConfig.processAnnotations(ContextConfig.java:1961)
        at org.apache.catalina.startup.ContextConfig.webConfig(ContextConfig.java:1319)
        at org.apache.catalina.startup.ContextConfig.configureStart(ContextConfig.java:878)
        at org.apache.catalina.startup.ContextConfig.lifecycleEvent(ContextConfig.java:376)
        at org.apache.catalina.util.LifecycleSupport.fireLifecycleEvent(LifecycleSupport.java:119)
        at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:90)
        at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5322)
        at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150)
        at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1559)
        at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1549)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
        at java.base/java.lang.Thread.run(Thread.java:833)

mar. 17, 2023 10:34:29 A.áM. com.sun.faces.config.ConfigureListener contextInitialized
INFO: Inicializando Mojarra 2.2.20 ( 20190731-0757 59754ac80c05d61848a08939ddd11a324f2345ac) para el contexto ''
mar. 17, 2023 10:34:29 A.áM. com.sun.faces.spi.InjectionProviderFactory createInstance
INFO: JSF1048: hay presentes anotaciones PostConstruct/PreDestroy.  Los mÚtodos de beans administrados marcados con estas anotaciones procesarßn dichas anotaciones.
mar. 17, 2023 10:34:30 A.áM. org.primefaces.webapp.PostConstructApplicationEventListener processEvent
INFO: Running on PrimeFaces 12.0.0
mar. 17, 2023 10:34:30 A.áM. org.apache.catalina.util.SessionIdGenerator createSecureRandom
INFO: Creation of SecureRandom instance for session ID generation using [SHA1PRNG] took [103] milliseconds.
mar. 17, 2023 10:34:31 A.áM. org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-bio-8080"]
mar. 17, 2023 10:34:50 A.áM. com.sun.faces.application.view.ViewScopeManager <init>
INFO: CDI @ViewScoped bean functionality unavailable
```

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessWorking.png)

7) Si todo funcionó correctamente, realice las siguientes pruebas:
- Abra la aplicación en un explorador. Realice algunas pruebas con el juego e intente adivinar el número.

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessAttempt1_0.png)

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessAttempt1_1.png)

- Abra la aplicación en dos computadores diferentes. Si no dispone de uno, hágalo en dos navegadores diferentes(por ejemplo Chrome y Firefox; incluso se puede en un único navegador usando una ventana normal y una ventana de incógnito / privada).Haga cinco intentos en uno, y luego un intento en el otro. ¿Qué valor tiene cada uno?

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessUsers.png)

_Se prueba adivinando el mismo número en las dos páginas y se observa que la informacion de una sesión y la otra se estan solapando entre si ya que un jugador gano 100000 y el otro sin hacer nada también acabo ganando 100000 sin hacer nada._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessUsersTest.png)

- Aborte el proceso de Tomcat-runner haciendo Ctrl+C en la consola, y modifique el código del backing-bean de manera que use la anotación @SessionScoped en lugar de @ApplicationScoped. Reinicie la aplicación y repita el ejercicio anterior ¿Coinciden los valores del premio?

_Una vez se modifico el tipo de sión se observa que en este caso la informacion de los jugadores ya no se solapa entre si._

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessSessionScoped.png)

Dado la anterior ¿Cuál es la diferencia entre los backing-beans de sesión y los de aplicación?
_Los backing bean de aplicacion crean una sola instancia de la clase que controla la lógica tras el JSF, es decir, que todo los usuarios que accedan al servicio web compartiran las mismas caracteristicas de información. Por otro lado, los de sesion crean instancias aparte para cada usuario que accede al servicio web y estos manejan los mismos atributos pero con valores diferentes_

- Por medio de las herramientas de desarrollador del explorador (Usando la tecla "F12" en la mayoría de exploradores):
    * Ubique el código HTML generado por el servidor. Busque el elemento oculto, que contiene el número generado aleatoriamente.
    
    ![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessHTML.png)
    
    * En la sección de estilos, deshabilite el estilo que oculta el elemento para que sea visible. Observe el cambio en la página, cada vez que se realiza un cambio en el estilo.
    
    ![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessHTMLVisible.png)

11. Para facilitar losintentos del usuario,se agregará una lista de los últimos intentos fallidos realizados:
a. Agregue en el Backing-Bean, una propiedad que contenga una lista de intentados realizados. Agregue cada intento a la lista, cuando se ejecute el método guess.
```
package edu.eci.cvds.servlet;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import java.util.ArrayList;

@ManagedBean(name = "guessBean")
@SessionScoped
public class GuessBean{
	private ArrayList<int> userNumbers = new ArrayList<int>();
	...
	public void gues(int numberChoosen){
		userNumbers.add(numberChoosen);
	...
```
b. Cuando se reinicie el juego, limpie el contenido de la lista.
```
public void reset(){
		userNumbers.removeAll();
		...
```
c. Busque cómo agregar una tabla a la página, cuyo contenido sea los últimos intentos realizados.

![](https://github.com/NickArB/CVDS-LABORATORIOS-ARIZA-2023-1/blob/main/Lab5/imagenes/guessTried.png)