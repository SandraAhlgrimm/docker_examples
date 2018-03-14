# BUILD STAGE
FROM golang:alpine AS build

# git is required for go get
RUN apk --no-cache upgrade && \
    apk --no-cache add git

WORKDIR /go/src/app
COPY ./src .

ENV GOLANG_VERSION 1.9.4

RUN go get -d -v ./...
RUN go install -v ./...

# FINAL STAGE
FROM alpine

COPY --from=build /go/bin/app /bin/app

ENV GIN_MODE=release
ENV PORT=8089

CMD ["app"]