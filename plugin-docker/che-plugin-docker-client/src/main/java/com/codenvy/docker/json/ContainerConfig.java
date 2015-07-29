/*
 * CODENVY CONFIDENTIAL
 * __________________
 *
 *  [2012] - [2015] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.docker.json;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** @author andrew00x */
public class ContainerConfig {
    private String                           domainName;
    private long                             memory;
    private long                             memorySwap;
    private int                              cpuShares;
    private String                           cpuset;
    private boolean                          attachStdin;
    private boolean                          attachStdout;
    private boolean                          attachStderr;
    private boolean                          tty;
    private boolean                          openStdin;
    private boolean                          stdinOnce;
    private String[]                         env;
    private String[]                         cmd;
    private String                           entrypoint;
    private String                           image;
    private boolean                          networkDisabled;
    private String                           macAddress;
    // from docs for 1.15 API https://docs.docker.com/reference/api/docker_remote_api_v1.15/#create-a-container
    // An object mapping ports to an empty object in the form of: "ExposedPorts": { "<port>/<tcp|udp>: {}" }
    private Map<String, Map<String, String>> exposedPorts;
    private String[]                         securityOpts;
    private HostConfig                       hostConfig;
    private String              hostname   = "";
    private String              user       = "";
    private String              workingDir = "";
    private Map<String, Volume> volumes    = new HashMap<>();

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String[] getEnv() {
        return env;
    }

    public void setEnv(String[] env) {
        this.env = env;
    }

    public int getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(int cpuShares) {
        this.cpuShares = cpuShares;
    }

    public long getMemory() {
        return memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }

    public long getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(long memorySwap) {
        this.memorySwap = memorySwap;
    }

    public boolean isAttachStdin() {
        return attachStdin;
    }

    public void setAttachStdin(boolean attachStdin) {
        this.attachStdin = attachStdin;
    }

    public boolean isAttachStdout() {
        return attachStdout;
    }

    public void setAttachStdout(boolean attachStdout) {
        this.attachStdout = attachStdout;
    }

    public boolean isAttachStderr() {
        return attachStderr;
    }

    public void setAttachStderr(boolean attachStderr) {
        this.attachStderr = attachStderr;
    }

    public boolean isTty() {
        return tty;
    }

    public void setTty(boolean tty) {
        this.tty = tty;
    }

    public boolean isOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(boolean openStdin) {
        this.openStdin = openStdin;
    }

    public boolean isStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public String[] getCmd() {
        return cmd;
    }

    public void setCmd(String[] cmd) {
        this.cmd = cmd;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map<String, Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<String, Volume> volumes) {
        this.volumes = volumes;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public boolean isNetworkDisabled() {
        return networkDisabled;
    }

    public void setNetworkDisabled(boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
    }

    @Override
    public String toString() {
        return "ContainerConfig{" +
               "hostname='" + hostname + '\'' +
               ", domainName='" + domainName + '\'' +
               ", user='" + user + '\'' +
               ", memory=" + memory +
               ", memorySwap=" + memorySwap +
               ", cpuShares=" + cpuShares +
               ", cpuset='" + cpuset + '\'' +
               ", attachStdin=" + attachStdin +
               ", attachStdout=" + attachStdout +
               ", attachStderr=" + attachStderr +
               ", tty=" + tty +
               ", openStdin=" + openStdin +
               ", stdinOnce=" + stdinOnce +
               ", env=" + Arrays.toString(env) +
               ", cmd=" + Arrays.toString(cmd) +
               ", entrypoint='" + entrypoint + '\'' +
               ", image='" + image + '\'' +
               ", volumes=" + volumes +
               ", workingDir='" + workingDir + '\'' +
               ", networkDisabled=" + networkDisabled +
               ", macAddress='" + macAddress + '\'' +
               ", exposedPorts=" + exposedPorts +
               ", securityOpts=" + Arrays.toString(securityOpts) +
               ", hostConfig=" + hostConfig +
               '}';
    }

    // -------------------

    public ContainerConfig withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public ContainerConfig withUser(String user) {
        this.user = user;
        return this;
    }

    public ContainerConfig withEnv(String... env) {
        this.env = env;
        return this;
    }

    public ContainerConfig withCpuShares(int cpuShares) {
        this.cpuShares = cpuShares;
        return this;
    }

    public ContainerConfig withMemory(long memory) {
        this.memory = memory;
        return this;
    }

    public ContainerConfig withMemorySwap(long memorySwap) {
        this.memorySwap = memorySwap;
        return this;
    }

    public ContainerConfig withAttachStdin(boolean attachStdin) {
        this.attachStdin = attachStdin;
        return this;
    }

    public ContainerConfig withAttachStdout(boolean attachStdout) {
        this.attachStdout = attachStdout;
        return this;
    }

    public ContainerConfig withAttachStderr(boolean attachStderr) {
        this.attachStderr = attachStderr;
        return this;
    }

    public ContainerConfig withTty(boolean tty) {
        this.tty = tty;
        return this;
    }

    public ContainerConfig withOpenStdin(boolean openStdin) {
        this.openStdin = openStdin;
        return this;
    }

    public ContainerConfig withStdinOnce(boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    public ContainerConfig withCmd(String... cmd) {
        this.cmd = cmd;
        return this;
    }

    public ContainerConfig withImage(String image) {
        this.image = image;
        return this;
    }

    public ContainerConfig withVolumes(Map<String, Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ContainerConfig withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    public ContainerConfig withNetworkDisabled(boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
        return this;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }

    public ContainerConfig withHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
        return this;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ContainerConfig withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getCpuset() {
        return cpuset;
    }

    public void setCpuset(String cpuset) {
        this.cpuset = cpuset;
    }

    public ContainerConfig withCpuset(String cpuset) {
        this.cpuset = cpuset;
        return this;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public ContainerConfig withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public ContainerConfig withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public Map<String, Map<String, String>> getExposedPorts() {
        return exposedPorts;
    }

    public void setExposedPorts(Map<String, Map<String, String>> exposedPorts) {
        this.exposedPorts = exposedPorts;
    }

    public ContainerConfig withExposedPorts(Map<String, Map<String, String>> exposedPorts) {
        this.exposedPorts = exposedPorts;
        return this;
    }

    public String[] getSecurityOpts() {
        return securityOpts;
    }

    public void setSecurityOpts(String[] securityOpts) {
        this.securityOpts = securityOpts;
    }

    public ContainerConfig withSecurityOpts(String[] securityOpts) {
        this.securityOpts = securityOpts;
        return this;
    }
}
