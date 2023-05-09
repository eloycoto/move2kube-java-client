USER=$(shell id -u $(shell whoami))
GROUP=$(shell id -g $(shell whoami))

download-openapi:
	curl https://raw.githubusercontent.com/konveyor/move2kube-api/main/assets/openapi.json -o openapi.json

generate: download-openapi
	rm -rf java-client
	docker run --rm -u $(USER):$(GROUP) -v $(PWD):/local -e GENERATE_PERMISSIONS=true openapitools/openapi-generator-cli generate -i /local/openapi.json -g java -o /local/java-client  --invoker-package dev.parodos.move2kube --model-package dev.parodos.move2kube.client.model --api-package dev.parodos.move2kube.api --group-id parodos.dev --artifact-id move2kube
