FROM maven:alpine

WORKDIR /app
COPY . .

RUN mvn install

ENV PORT=8087

EXPOSE 8087

ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar target/*-fat.jar"]