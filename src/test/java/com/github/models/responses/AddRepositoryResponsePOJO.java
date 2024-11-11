package com.github.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddRepositoryResponsePOJO<Permissions, Owner> {

	    @JsonProperty("login") 
	    public String getLogin() { 
			 return this.login; } 
	    public void setLogin(String login) { 
			 this.login = login; } 
	    String login;
	    @JsonProperty("id") 
	    public int getId() { 
			 return this.id; } 
	    public void setId(int id) { 
			 this.id = id; } 
	    int id;
	    @JsonProperty("node_id") 
	    public String getNode_id() { 
			 return this.node_id; } 
	    public void setNode_id(String node_id) { 
			 this.node_id = node_id; } 
	    String node_id;
	    @JsonProperty("avatar_url") 
	    public String getAvatar_url() { 
			 return this.avatar_url; } 
	    public void setAvatar_url(String avatar_url) { 
			 this.avatar_url = avatar_url; } 
	    String avatar_url;
	    @JsonProperty("gravatar_id") 
	    public String getGravatar_id() { 
			 return this.gravatar_id; } 
	    public void setGravatar_id(String gravatar_id) { 
			 this.gravatar_id = gravatar_id; } 
	    String gravatar_id;
	    @JsonProperty("url") 
	    public String getUrl() { 
			 return this.url; } 
	    public void setUrl(String url) { 
			 this.url = url; } 
	    String url;
	    @JsonProperty("html_url") 
	    public String getHtml_url() { 
			 return this.html_url; } 
	    public void setHtml_url(String html_url) { 
			 this.html_url = html_url; } 
	    String html_url;
	    @JsonProperty("followers_url") 
	    public String getFollowers_url() { 
			 return this.followers_url; } 
	    public void setFollowers_url(String followers_url) { 
			 this.followers_url = followers_url; } 
	    String followers_url;
	    @JsonProperty("following_url") 
	    public String getFollowing_url() { 
			 return this.following_url; } 
	    public void setFollowing_url(String following_url) { 
			 this.following_url = following_url; } 
	    String following_url;
	    @JsonProperty("gists_url") 
	    public String getGists_url() { 
			 return this.gists_url; } 
	    public void setGists_url(String gists_url) { 
			 this.gists_url = gists_url; } 
	    String gists_url;
	    @JsonProperty("starred_url") 
	    public String getStarred_url() { 
			 return this.starred_url; } 
	    public void setStarred_url(String starred_url) { 
			 this.starred_url = starred_url; } 
	    String starred_url;
	    @JsonProperty("subscriptions_url") 
	    public String getSubscriptions_url() { 
			 return this.subscriptions_url; } 
	    public void setSubscriptions_url(String subscriptions_url) { 
			 this.subscriptions_url = subscriptions_url; } 
	    String subscriptions_url;
	    @JsonProperty("organizations_url") 
	    public String getOrganizations_url() { 
			 return this.organizations_url; } 
	    public void setOrganizations_url(String organizations_url) { 
			 this.organizations_url = organizations_url; } 
	    String organizations_url;
	    @JsonProperty("repos_url") 
	    public String getRepos_url() { 
			 return this.repos_url; } 
	    public void setRepos_url(String repos_url) { 
			 this.repos_url = repos_url; } 
	    String repos_url;
	    @JsonProperty("events_url") 
	    public String getEvents_url() { 
			 return this.events_url; } 
	    public void setEvents_url(String events_url) { 
			 this.events_url = events_url; } 
	    String events_url;
	    @JsonProperty("received_events_url") 
	    public String getReceived_events_url() { 
			 return this.received_events_url; } 
	    public void setReceived_events_url(String received_events_url) { 
			 this.received_events_url = received_events_url; } 
	    String received_events_url;
	    @JsonProperty("type") 
	    public String getType() { 
			 return this.type; } 
	    public void setType(String type) { 
			 this.type = type; } 
	    String type;
	    @JsonProperty("user_view_type") 
	    public String getUser_view_type() { 
			 return this.user_view_type; } 
	    public void setUser_view_type(String user_view_type) { 
			 this.user_view_type = user_view_type; } 
	    String user_view_type;
	    @JsonProperty("site_admin") 
	    public boolean getSite_admin() { 
			 return this.site_admin; } 
	    public void setSite_admin(boolean site_admin) { 
			 this.site_admin = site_admin; } 
	    boolean site_admin;
	

	
	    @JsonProperty("admin") 
	    public boolean getAdmin() { 
			 return this.admin; } 
	    public void setAdmin(boolean admin) { 
			 this.admin = admin; } 
	    boolean admin;
	    @JsonProperty("maintain") 
	    public boolean getMaintain() { 
			 return this.maintain; } 
	    public void setMaintain(boolean maintain) { 
			 this.maintain = maintain; } 
	    boolean maintain;
	    @JsonProperty("push") 
	    public boolean getPush() { 
			 return this.push; } 
	    public void setPush(boolean push) { 
			 this.push = push; } 
	    boolean push;
	    @JsonProperty("triage") 
	    public boolean getTriage() { 
			 return this.triage; } 
	    public void setTriage(boolean triage) { 
			 this.triage = triage; } 
	    boolean triage;
	    @JsonProperty("pull") 
	    public boolean getPull() { 
			 return this.pull; } 
	    public void setPull(boolean pull) { 
			 this.pull = pull; } 
	    boolean pull;


		
	    @JsonProperty("name") 
	    public String getName() { 
			 return this.name; } 
	    public void setName(String name) { 
			 this.name = name; } 
	    String name;
	    @JsonProperty("full_name") 
	    public String getFull_name() { 
			 return this.full_name; } 
	    public void setFull_name(String full_name) { 
			 this.full_name = full_name; } 
	    String full_name;
	    @JsonProperty("private") 
	    public boolean getMyprivate() { 
			 return this.myprivate; } 
	    public void setMyprivate(boolean myprivate) { 
			 this.myprivate = myprivate; } 
	    boolean myprivate;
	    @JsonProperty("owner") 
	    public Owner getOwner() { 
			 return this.owner; } 
	    public void setOwner(Owner owner) { 
			 this.owner = owner; } 
	    Owner owner;
	   /* @JsonProperty("html_url") 
	    public String getHtml_url() { 
			 return this.html_url; } 
	    public void setHtml_url(String html_url) { 
			 this.html_url = html_url; } 
	    String html_url;*/
	    @JsonProperty("description") 
	    public String getDescription() { 
			 return this.description; } 
	    public void setDescription(String description) { 
			 this.description = description; } 
	    String description;
	    @JsonProperty("fork") 
	    public boolean getFork() { 
			 return this.fork; } 
	    public void setFork(boolean fork) { 
			 this.fork = fork; } 
	    boolean fork;
	    /*@JsonProperty("url") 
	    public String getUrl() { 
			 return this.url; } 
	    public void setUrl(String url) { 
			 this.url = url; } 
	    String url;*/
	    @JsonProperty("forks_url") 
	    public String getForks_url() { 
			 return this.forks_url; } 
	    public void setForks_url(String forks_url) { 
			 this.forks_url = forks_url; } 
	    String forks_url;
	    @JsonProperty("keys_url") 
	    public String getKeys_url() { 
			 return this.keys_url; } 
	    public void setKeys_url(String keys_url) { 
			 this.keys_url = keys_url; } 
	    String keys_url;
	    @JsonProperty("collaborators_url") 
	    public String getCollaborators_url() { 
			 return this.collaborators_url; } 
	    public void setCollaborators_url(String collaborators_url) { 
			 this.collaborators_url = collaborators_url; } 
	    String collaborators_url;
	    @JsonProperty("teams_url") 
	    public String getTeams_url() { 
			 return this.teams_url; } 
	    public void setTeams_url(String teams_url) { 
			 this.teams_url = teams_url; } 
	    String teams_url;
	    @JsonProperty("hooks_url") 
	    public String getHooks_url() { 
			 return this.hooks_url; } 
	    public void setHooks_url(String hooks_url) { 
			 this.hooks_url = hooks_url; } 
	    String hooks_url;
	    @JsonProperty("issue_events_url") 
	    public String getIssue_events_url() { 
			 return this.issue_events_url; } 
	    public void setIssue_events_url(String issue_events_url) { 
			 this.issue_events_url = issue_events_url; } 
	    String issue_events_url;
	   /* @JsonProperty("events_url") 
	    public String getEvents_url() { 
			 return this.events_url; } 
	    public void setEvents_url(String events_url) { 
			 this.events_url = events_url; } 
	    String events_url;*/
	    @JsonProperty("assignees_url") 
	    public String getAssignees_url() { 
			 return this.assignees_url; } 
	    public void setAssignees_url(String assignees_url) { 
			 this.assignees_url = assignees_url; } 
	    String assignees_url;
	    @JsonProperty("branches_url") 
	    public String getBranches_url() { 
			 return this.branches_url; } 
	    public void setBranches_url(String branches_url) { 
			 this.branches_url = branches_url; } 
	    String branches_url;
	    @JsonProperty("tags_url") 
	    public String getTags_url() { 
			 return this.tags_url; } 
	    public void setTags_url(String tags_url) { 
			 this.tags_url = tags_url; } 
	    String tags_url;
	    @JsonProperty("blobs_url") 
	    public String getBlobs_url() { 
			 return this.blobs_url; } 
	    public void setBlobs_url(String blobs_url) { 
			 this.blobs_url = blobs_url; } 
	    String blobs_url;
	    @JsonProperty("git_tags_url") 
	    public String getGit_tags_url() { 
			 return this.git_tags_url; } 
	    public void setGit_tags_url(String git_tags_url) { 
			 this.git_tags_url = git_tags_url; } 
	    String git_tags_url;
	    @JsonProperty("git_refs_url") 
	    public String getGit_refs_url() { 
			 return this.git_refs_url; } 
	    public void setGit_refs_url(String git_refs_url) { 
			 this.git_refs_url = git_refs_url; } 
	    String git_refs_url;
	    @JsonProperty("trees_url") 
	    public String getTrees_url() { 
			 return this.trees_url; } 
	    public void setTrees_url(String trees_url) { 
			 this.trees_url = trees_url; } 
	    String trees_url;
	    @JsonProperty("statuses_url") 
	    public String getStatuses_url() { 
			 return this.statuses_url; } 
	    public void setStatuses_url(String statuses_url) { 
			 this.statuses_url = statuses_url; } 
	    String statuses_url;
	    @JsonProperty("languages_url") 
	    public String getLanguages_url() { 
			 return this.languages_url; } 
	    public void setLanguages_url(String languages_url) { 
			 this.languages_url = languages_url; } 
	    String languages_url;
	    @JsonProperty("stargazers_url") 
	    public String getStargazers_url() { 
			 return this.stargazers_url; } 
	    public void setStargazers_url(String stargazers_url) { 
			 this.stargazers_url = stargazers_url; } 
	    String stargazers_url;
	    @JsonProperty("contributors_url") 
	    public String getContributors_url() { 
			 return this.contributors_url; } 
	    public void setContributors_url(String contributors_url) { 
			 this.contributors_url = contributors_url; } 
	    String contributors_url;
	    @JsonProperty("subscribers_url") 
	    public String getSubscribers_url() { 
			 return this.subscribers_url; } 
	    public void setSubscribers_url(String subscribers_url) { 
			 this.subscribers_url = subscribers_url; } 
	    String subscribers_url;
	    @JsonProperty("subscription_url") 
	    public String getSubscription_url() { 
			 return this.subscription_url; } 
	    public void setSubscription_url(String subscription_url) { 
			 this.subscription_url = subscription_url; } 
	    String subscription_url;
	    @JsonProperty("commits_url") 
	    public String getCommits_url() { 
			 return this.commits_url; } 
	    public void setCommits_url(String commits_url) { 
			 this.commits_url = commits_url; } 
	    String commits_url;
	    @JsonProperty("git_commits_url") 
	    public String getGit_commits_url() { 
			 return this.git_commits_url; } 
	    public void setGit_commits_url(String git_commits_url) { 
			 this.git_commits_url = git_commits_url; } 
	    String git_commits_url;
	    @JsonProperty("comments_url") 
	    public String getComments_url() { 
			 return this.comments_url; } 
	    public void setComments_url(String comments_url) { 
			 this.comments_url = comments_url; } 
	    String comments_url;
	    @JsonProperty("issue_comment_url") 
	    public String getIssue_comment_url() { 
			 return this.issue_comment_url; } 
	    public void setIssue_comment_url(String issue_comment_url) { 
			 this.issue_comment_url = issue_comment_url; } 
	    String issue_comment_url;
	    @JsonProperty("contents_url") 
	    public String getContents_url() { 
			 return this.contents_url; } 
	    public void setContents_url(String contents_url) { 
			 this.contents_url = contents_url; } 
	    String contents_url;
	    @JsonProperty("compare_url") 
	    public String getCompare_url() { 
			 return this.compare_url; } 
	    public void setCompare_url(String compare_url) { 
			 this.compare_url = compare_url; } 
	    String compare_url;
	    @JsonProperty("merges_url") 
	    public String getMerges_url() { 
			 return this.merges_url; } 
	    public void setMerges_url(String merges_url) { 
			 this.merges_url = merges_url; } 
	    String merges_url;
	    @JsonProperty("archive_url") 
	    public String getArchive_url() { 
			 return this.archive_url; } 
	    public void setArchive_url(String archive_url) { 
			 this.archive_url = archive_url; } 
	    String archive_url;
	    @JsonProperty("downloads_url") 
	    public String getDownloads_url() { 
			 return this.downloads_url; } 
	    public void setDownloads_url(String downloads_url) { 
			 this.downloads_url = downloads_url; } 
	    String downloads_url;
	    @JsonProperty("issues_url") 
	    public String getIssues_url() { 
			 return this.issues_url; } 
	    public void setIssues_url(String issues_url) { 
			 this.issues_url = issues_url; } 
	    String issues_url;
	    @JsonProperty("pulls_url") 
	    public String getPulls_url() { 
			 return this.pulls_url; } 
	    public void setPulls_url(String pulls_url) { 
			 this.pulls_url = pulls_url; } 
	    String pulls_url;
	    @JsonProperty("milestones_url") 
	    public String getMilestones_url() { 
			 return this.milestones_url; } 
	    public void setMilestones_url(String milestones_url) { 
			 this.milestones_url = milestones_url; } 
	    String milestones_url;
	    @JsonProperty("notifications_url") 
	    public String getNotifications_url() { 
			 return this.notifications_url; } 
	    public void setNotifications_url(String notifications_url) { 
			 this.notifications_url = notifications_url; } 
	    String notifications_url;
	    @JsonProperty("labels_url") 
	    public String getLabels_url() { 
			 return this.labels_url; } 
	    public void setLabels_url(String labels_url) { 
			 this.labels_url = labels_url; } 
	    String labels_url;
	    @JsonProperty("releases_url") 
	    public String getReleases_url() { 
			 return this.releases_url; } 
	    public void setReleases_url(String releases_url) { 
			 this.releases_url = releases_url; } 
	    String releases_url;
	    @JsonProperty("deployments_url") 
	    public String getDeployments_url() { 
			 return this.deployments_url; } 
	    public void setDeployments_url(String deployments_url) { 
			 this.deployments_url = deployments_url; } 
	    String deployments_url;
	    @JsonProperty("created_at") 
	    public Date getCreated_at() { 
			 return this.created_at; } 
	    public void setCreated_at(Date created_at) { 
			 this.created_at = created_at; } 
	    Date created_at;
	    @JsonProperty("updated_at") 
	    public Date getUpdated_at() { 
			 return this.updated_at; } 
	    public void setUpdated_at(Date updated_at) { 
			 this.updated_at = updated_at; } 
	    Date updated_at;
	    @JsonProperty("pushed_at") 
	    public Date getPushed_at() { 
			 return this.pushed_at; } 
	    public void setPushed_at(Date pushed_at) { 
			 this.pushed_at = pushed_at; } 
	    Date pushed_at;
	    @JsonProperty("git_url") 
	    public String getGit_url() { 
			 return this.git_url; } 
	    public void setGit_url(String git_url) { 
			 this.git_url = git_url; } 
	    String git_url;
	    @JsonProperty("ssh_url") 
	    public String getSsh_url() { 
			 return this.ssh_url; } 
	    public void setSsh_url(String ssh_url) { 
			 this.ssh_url = ssh_url; } 
	    String ssh_url;
	    @JsonProperty("clone_url") 
	    public String getClone_url() { 
			 return this.clone_url; } 
	    public void setClone_url(String clone_url) { 
			 this.clone_url = clone_url; } 
	    String clone_url;
	    @JsonProperty("svn_url") 
	    public String getSvn_url() { 
			 return this.svn_url; } 
	    public void setSvn_url(String svn_url) { 
			 this.svn_url = svn_url; } 
	    String svn_url;
	    @JsonProperty("homepage") 
	    public String getHomepage() { 
			 return this.homepage; } 
	    public void setHomepage(String homepage) { 
			 this.homepage = homepage; } 
	    String homepage;
	    @JsonProperty("size") 
	    public int getSize() { 
			 return this.size; } 
	    public void setSize(int size) { 
			 this.size = size; } 
	    int size;
	    @JsonProperty("stargazers_count") 
	    public int getStargazers_count() { 
			 return this.stargazers_count; } 
	    public void setStargazers_count(int stargazers_count) { 
			 this.stargazers_count = stargazers_count; } 
	    int stargazers_count;
	    @JsonProperty("watchers_count") 
	    public int getWatchers_count() { 
			 return this.watchers_count; } 
	    public void setWatchers_count(int watchers_count) { 
			 this.watchers_count = watchers_count; } 
	    int watchers_count;
	    @JsonProperty("language") 
	    public Object getLanguage() { 
			 return this.language; } 
	    public void setLanguage(Object language) { 
			 this.language = language; } 
	    Object language;
	    @JsonProperty("has_issues") 
	    public boolean getHas_issues() { 
			 return this.has_issues; } 
	    public void setHas_issues(boolean has_issues) { 
			 this.has_issues = has_issues; } 
	    boolean has_issues;
	    @JsonProperty("has_projects") 
	    public boolean getHas_projects() { 
			 return this.has_projects; } 
	    public void setHas_projects(boolean has_projects) { 
			 this.has_projects = has_projects; } 
	    boolean has_projects;
	    @JsonProperty("has_downloads") 
	    public boolean getHas_downloads() { 
			 return this.has_downloads; } 
	    public void setHas_downloads(boolean has_downloads) { 
			 this.has_downloads = has_downloads; } 
	    boolean has_downloads;
	    @JsonProperty("has_wiki") 
	    public boolean getHas_wiki() { 
			 return this.has_wiki; } 
	    public void setHas_wiki(boolean has_wiki) { 
			 this.has_wiki = has_wiki; } 
	    boolean has_wiki;
	    @JsonProperty("has_pages") 
	    public boolean getHas_pages() { 
			 return this.has_pages; } 
	    public void setHas_pages(boolean has_pages) { 
			 this.has_pages = has_pages; } 
	    boolean has_pages;
	    @JsonProperty("has_discussions") 
	    public boolean getHas_discussions() { 
			 return this.has_discussions; } 
	    public void setHas_discussions(boolean has_discussions) { 
			 this.has_discussions = has_discussions; } 
	    boolean has_discussions;
	    @JsonProperty("forks_count") 
	    public int getForks_count() { 
			 return this.forks_count; } 
	    public void setForks_count(int forks_count) { 
			 this.forks_count = forks_count; } 
	    int forks_count;
	    @JsonProperty("mirror_url") 
	    public Object getMirror_url() { 
			 return this.mirror_url; } 
	    public void setMirror_url(Object mirror_url) { 
			 this.mirror_url = mirror_url; } 
	    Object mirror_url;
	    @JsonProperty("archived") 
	    public boolean getArchived() { 
			 return this.archived; } 
	    public void setArchived(boolean archived) { 
			 this.archived = archived; } 
	    boolean archived;
	    @JsonProperty("disabled") 
	    public boolean getDisabled() { 
			 return this.disabled; } 
	    public void setDisabled(boolean disabled) { 
			 this.disabled = disabled; } 
	    boolean disabled;
	    @JsonProperty("open_issues_count") 
	    public int getOpen_issues_count() { 
			 return this.open_issues_count; } 
	    public void setOpen_issues_count(int open_issues_count) { 
			 this.open_issues_count = open_issues_count; } 
	    int open_issues_count;
	    @JsonProperty("license") 
	    public Object getLicense() { 
			 return this.license; } 
	    public void setLicense(Object license) { 
			 this.license = license; } 
	    Object license;
	    @JsonProperty("allow_forking") 
	    public boolean getAllow_forking() { 
			 return this.allow_forking; } 
	    public void setAllow_forking(boolean allow_forking) { 
			 this.allow_forking = allow_forking; } 
	    boolean allow_forking;
	    @JsonProperty("is_template") 
	    public boolean getIs_template() { 
			 return this.is_template; } 
	    public void setIs_template(boolean is_template) { 
			 this.is_template = is_template; } 
	    boolean is_template;
	    @JsonProperty("web_commit_signoff_required") 
	    public boolean getWeb_commit_signoff_required() { 
			 return this.web_commit_signoff_required; } 
	    public void setWeb_commit_signoff_required(boolean web_commit_signoff_required) { 
			 this.web_commit_signoff_required = web_commit_signoff_required; } 
	    boolean web_commit_signoff_required;
	    @JsonProperty("topics") 
	    public ArrayList<Object> getTopics() { 
			 return this.topics; } 
	    public void setTopics(ArrayList<Object> topics) { 
			 this.topics = topics; } 
	    ArrayList<Object> topics;
	    @JsonProperty("visibility") 
	    public String getVisibility() { 
			 return this.visibility; } 
	    public void setVisibility(String visibility) { 
			 this.visibility = visibility; } 
	    String visibility;
	    @JsonProperty("forks") 
	    public int getForks() { 
			 return this.forks; } 
	    public void setForks(int forks) { 
			 this.forks = forks; } 
	    int forks;
	    @JsonProperty("open_issues") 
	    public int getOpen_issues() { 
			 return this.open_issues; } 
	    public void setOpen_issues(int open_issues) { 
			 this.open_issues = open_issues; } 
	    int open_issues;
	    @JsonProperty("watchers") 
	    public int getWatchers() { 
			 return this.watchers; } 
	    public void setWatchers(int watchers) { 
			 this.watchers = watchers; } 
	    int watchers;
	    @JsonProperty("default_branch") 
	    public String getDefault_branch() { 
			 return this.default_branch; } 
	    public void setDefault_branch(String default_branch) { 
			 this.default_branch = default_branch; } 
	    String default_branch;
	    @JsonProperty("permissions") 
	    public Permissions getPermissions() { 
			 return this.permissions; } 
	    public void setPermissions(Permissions permissions) { 
			 this.permissions = permissions; } 
	    Permissions permissions;
	    @JsonProperty("allow_squash_merge") 
	    public boolean getAllow_squash_merge() { 
			 return this.allow_squash_merge; } 
	    public void setAllow_squash_merge(boolean allow_squash_merge) { 
			 this.allow_squash_merge = allow_squash_merge; } 
	    boolean allow_squash_merge;
	    @JsonProperty("allow_merge_commit") 
	    public boolean getAllow_merge_commit() { 
			 return this.allow_merge_commit; } 
	    public void setAllow_merge_commit(boolean allow_merge_commit) { 
			 this.allow_merge_commit = allow_merge_commit; } 
	    boolean allow_merge_commit;
	    @JsonProperty("allow_rebase_merge") 
	    public boolean getAllow_rebase_merge() { 
			 return this.allow_rebase_merge; } 
	    public void setAllow_rebase_merge(boolean allow_rebase_merge) { 
			 this.allow_rebase_merge = allow_rebase_merge; } 
	    boolean allow_rebase_merge;
	    @JsonProperty("allow_auto_merge") 
	    public boolean getAllow_auto_merge() { 
			 return this.allow_auto_merge; } 
	    public void setAllow_auto_merge(boolean allow_auto_merge) { 
			 this.allow_auto_merge = allow_auto_merge; } 
	    boolean allow_auto_merge;
	    @JsonProperty("delete_branch_on_merge") 
	    public boolean getDelete_branch_on_merge() { 
			 return this.delete_branch_on_merge; } 
	    public void setDelete_branch_on_merge(boolean delete_branch_on_merge) { 
			 this.delete_branch_on_merge = delete_branch_on_merge; } 
	    boolean delete_branch_on_merge;
	    @JsonProperty("allow_update_branch") 
	    public boolean getAllow_update_branch() { 
			 return this.allow_update_branch; } 
	    public void setAllow_update_branch(boolean allow_update_branch) { 
			 this.allow_update_branch = allow_update_branch; } 
	    boolean allow_update_branch;
	    @JsonProperty("use_squash_pr_title_as_default") 
	    public boolean getUse_squash_pr_title_as_default() { 
			 return this.use_squash_pr_title_as_default; } 
	    public void setUse_squash_pr_title_as_default(boolean use_squash_pr_title_as_default) { 
			 this.use_squash_pr_title_as_default = use_squash_pr_title_as_default; } 
	    boolean use_squash_pr_title_as_default;
	    @JsonProperty("squash_merge_commit_message") 
	    public String getSquash_merge_commit_message() { 
			 return this.squash_merge_commit_message; } 
	    public void setSquash_merge_commit_message(String squash_merge_commit_message) { 
			 this.squash_merge_commit_message = squash_merge_commit_message; } 
	    String squash_merge_commit_message;
	    @JsonProperty("squash_merge_commit_title") 
	    public String getSquash_merge_commit_title() { 
			 return this.squash_merge_commit_title; } 
	    public void setSquash_merge_commit_title(String squash_merge_commit_title) { 
			 this.squash_merge_commit_title = squash_merge_commit_title; } 
	    String squash_merge_commit_title;
	    @JsonProperty("merge_commit_message") 
	    public String getMerge_commit_message() { 
			 return this.merge_commit_message; } 
	    public void setMerge_commit_message(String merge_commit_message) { 
			 this.merge_commit_message = merge_commit_message; } 
	    String merge_commit_message;
	    @JsonProperty("merge_commit_title") 
	    public String getMerge_commit_title() { 
			 return this.merge_commit_title; } 
	    public void setMerge_commit_title(String merge_commit_title) { 
			 this.merge_commit_title = merge_commit_title; } 
	    String merge_commit_title;
	    @JsonProperty("network_count") 
	    public int getNetwork_count() { 
			 return this.network_count; } 
	    public void setNetwork_count(int network_count) { 
			 this.network_count = network_count; } 
	    int network_count;
	    @JsonProperty("subscribers_count") 
	    public int getSubscribers_count() { 
			 return this.subscribers_count; } 
	    public void setSubscribers_count(int subscribers_count) { 
			 this.subscribers_count = subscribers_count; } 
	    int subscribers_count;
	


}
