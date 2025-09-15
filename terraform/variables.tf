variable "vm_memory" {
  description = "Memory allocated to the VM in MB"
  type        = number
  default     = 2048
}

variable "vm_cpus" {
  description = "Number of CPUs allocated to the VM"
  type        = number
  default     = 1
}

variable "vm_ip_address" {
  description = "Static IP address for the VM"
  type        = string
  default     = "192.168.56.11"
}