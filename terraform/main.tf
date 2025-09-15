terraform {
  required_providers {
    vagrant = {
      source  = "bmatcuk/vagrant"
      version = "~> 4.0"
    }
  }
}

provider "vagrant" {}

# Build the JAR file first
resource "null_resource" "build_jar" {
  provisioner "local-exec" {
    command = "cd .. && ./gradlew build"
  }

  triggers = {
    # Rebuild when source files change
    source_hash = filemd5("../build.gradle")
  }
}

resource "vagrant_vm" "greeting_spi_keycloak_vm" {
  depends_on = [null_resource.build_jar]
  
  vagrantfile_dir = "../"
  
  # Force recreation when Vagrantfile changes
  triggers = {
    vagrantfile_hash = filemd5("../Vagrantfile")
  }
}