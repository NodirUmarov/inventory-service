## Stack deployment
* 1st deploy db-template and name stack as **db-stack**
* 2nd deploy app-template and name stack as **app-stack** 

## Db connection

To connect to db run 
```
psql -U ${username} -d ${db_name} -h ${db_endpoint}
```
to get certificate for psql to securely connect to db from data lense
https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html