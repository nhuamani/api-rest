## Windows

### Ver PROCESO en puerto 8080
netstat -ano | findstr LISTENING | findstr 8080

### Eliminar el proceso
taskkill -PID [process_number] -F

## Linux

### Ver PROCESO en puerto 8080
sudo netstat -anp | grep 8080

### Eliminar el proceso
sudo kill -9 [process_number]