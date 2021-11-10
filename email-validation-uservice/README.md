# email validation service

## how to run

docker run -p 8080:8080 0netx/emailvalidation

## how to test

curl --location --request POST 'http://localhost:8080/validate-email' \
--header 'Content-Type: text/plain' \
--data-raw 'email@email.com'


## Open API

http://localhost:8080/v3/api-docs
