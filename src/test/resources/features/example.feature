 Feature: Testing RESTful API
   Users should be able to submit GET and POST requests to a web service,

  Scenario: GET call
    Given a clean slate
    When get api '/api/endpoint' is called
    Then the server returns 200 status with body: 'Blowow'
