build:
	docker build -t hello .

run:
	docker run -d -p 8080:8080 --name hello --rm hello