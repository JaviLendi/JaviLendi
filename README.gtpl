<p align="center"><img src="https://github.com/JaviLendi/JaviLendi/blob/8b092c87149dd909d30b5835611e526b4a3b976d/logo.png" /></p>

### GitHub Stats

[//]: # "[![CodeTime Badge](https://img.shields.io/endpoint?style=for-the-badge&color=222&url=https%3A%2F%2Fapi.codetime.dev%2Fshield%3Fid%3D25485%26project%3D%26in=0)](https://codetime.dev)"

<p align="left"><img src="https://raw.githubusercontent.com/JaviLendi/JaviLendi/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📫 How to reach me:
  - Twitter   : <https://twitter.com/javi_lendi>
  - Linkedin   : <https://www.linkedin.com/in/javierlendinez/>
