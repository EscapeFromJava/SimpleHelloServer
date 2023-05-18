build:
	docker build -t hello .

run:
	docker run -d -p 80:80 --name hello --rm hello
