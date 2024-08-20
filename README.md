<h1>ParkingFindAppServer</h1>
<p>Welcome to the <strong>ParkingFindAppServer</strong> repository! This is the backend application server for the ParkingFindApp, responsible for providing information about nearby parking lots to the mobile app.</p>
<h2>Table of Contents</h2>
<ul>
   <li><a href="#overview">Overview</a></li>
   <li><a href="#features">Features</a></li>
   <li><a href="#api-endpoints">API Endpoints</a></li>
   <li><a href="#technologies-used">Technologies Used</a></li>
   <li><a href="#contact">Contact</a></li>
</ul>
<h2>Overview</h2>
<p>ParkingFindAppServer is a Spring Boot application that serves as the backend for the ParkingFindApp. It processes requests from the mobile app, retrieves data about available parking lots, and sends this information back to the app to help users find the nearest and most suitable parking spots.</p>
<h2>Features</h2>
<ul>
   <li><strong>Real-time Parking Data</strong>: Provides up-to-date information about nearby parking lots.</li>
   <li><strong>Geolocation Support</strong>: Returns parking lots based on the user's current location.</li>
   <li><strong>RESTful API</strong>: Offers a clean and intuitive API for client applications.</li>
   <li><strong>Scalability</strong>: Built using Spring Boot, making it easy to scale and maintain.</li>
</ul>
<h2>API Endpoints</h2>
<p>The following are the key API endpoints provided by ParkingFindAppServer:</p>
<ul>
  <li>
    <strong>POST api/parking</strong>: Returns a list of the closest parking lots based on the provided coordinates.
    <ul>
      <li>
        <strong>Parameters</strong>:
        <ul>
          <li><code>latitude</code> (required)</li>
          <li><code>longitude</code> (required)</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    <strong>POST api/parking/desc</strong>: Fetches detailed information about a specific parking lot by ID.
    <ul>
      <li>
        <strong>Parameters</strong>:
        <ul>
          <li><code>id</code> (required)</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>
<h2>Technologies Used</h2>
<ul>
   <li><strong>Backend Framework:</strong> Spring Boot</li>
   <li><strong>Language:</strong> Java</li>
   <li><strong>Data Storage:</strong> PostgreSQL</li>
   <li><strong>Build Tool:</strong> Maven</li>
</ul>
