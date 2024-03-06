# MERLOT Models Library

This repository contains a maven library that is shared amongst the microservices of
the MERLOT marketplace.

It encapsulates model classes for the REST API objects of each service as well
as classes that are required for interacting with the Message Queue and with
EDC Connectors.

## Structure

```
├── src/main/java/eu/merloteducation/modelslib
│   ├── api                   # model classes of the REST APIs
│   │   ├── contract          # contract orchestrator REST DTOs
│   │   ├── organization      # organisation orchestrator REST DTOs
│   │   ├── serviceoffering   # serviceoffering orchestrator REST DTOs
│   ├── edc                   # model classes for EDC interaction
│   ├── queue                 # DTOs for interacting with the message queue
```
