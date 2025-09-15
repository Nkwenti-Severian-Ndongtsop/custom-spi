output "vm_ip_address" {
  description = "The static IP address of the created VM"
  value       = var.vm_ip_address
}

output "keycloak_url" {
  description = "URL to access Keycloak"
  value       = "http://${var.vm_ip_address}:8080"
}

output "vm_status" {
  description = "Status of the VM"
  value       = "VM created and services should be running"
}
