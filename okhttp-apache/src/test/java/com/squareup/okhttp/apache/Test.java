


<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>okhttp/Test.java at prod · ankit3005/okhttp</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="ankit3005/okhttp" name="twitter:title" /><meta content="okhttp - An HTTP+SPDY client for Android and Java applications." name="twitter:description" /><meta content="https://avatars0.githubusercontent.com/u/3266051?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars0.githubusercontent.com/u/3266051?v=3&amp;s=400" property="og:image" /><meta content="ankit3005/okhttp" property="og:title" /><meta content="https://github.com/ankit3005/okhttp" property="og:url" /><meta content="okhttp - An HTTP+SPDY client for Android and Java applications." property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/OTMwNTU3NzozMmRmNmRmYmMxMzQ5N2RhMDUyOGJiMDUxNDQzZTE5ZTpmYWMyNDk2YzdhYmQzNjNiYjg1NmMyMDRhN2NlMDRhZDcxZDBhNDY2ODYwMWNhMDE4NGEwMDc1MjU4M2ZjMzJl--2771ba175656b3cf1ffc460c52e176cd7a683312">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="AE63064F:798D:93855:562AB728" name="octolytics-dimension-request_id" /><meta content="9305577" name="octolytics-actor-id" /><meta content="apoorvmahajan" name="octolytics-actor-login" /><meta content="f1fce2075ec12f468fbe6a34de394bbd27dc1c3916353d6dda8e66ad5ec30450" name="octolytics-actor-hash" />

<meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />


  <meta class="js-ga-set" name="dimension1" content="Logged In">
    <meta class="js-ga-set" name="dimension4" content="Current repo nav">




    <meta name="is-dotcom" content="true">
        <meta name="hostname" content="github.com">
    <meta name="user-login" content="apoorvmahajan">

      <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <meta content="e15e8dc056986a424a3f87375df0446852bee8a6" name="form-nonce" />

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-0ac1316e47acaf19726c8994485559ed3b3eb52e897c080911aa4fddee18d3b1.css" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2-ed11b2e059c035eff96c8e0662efb7bbcffa8acc4978b0b94a8830b79ddf1736.css" media="all" rel="stylesheet" />
    
    
    


    <meta http-equiv="x-pjax-version" content="da1c7eab35d3e0bf7670bd90c13ffb76">

      
  <meta name="description" content="okhttp - An HTTP+SPDY client for Android and Java applications.">
  <meta name="go-import" content="github.com/ankit3005/okhttp git https://github.com/ankit3005/okhttp.git">

  <meta content="3266051" name="octolytics-dimension-user_id" /><meta content="ankit3005" name="octolytics-dimension-user_login" /><meta content="44637451" name="octolytics-dimension-repository_id" /><meta content="ankit3005/okhttp" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="true" name="octolytics-dimension-repository_is_fork" /><meta content="5152285" name="octolytics-dimension-repository_parent_id" /><meta content="square/okhttp" name="octolytics-dimension-repository_parent_nwo" /><meta content="5152285" name="octolytics-dimension-repository_network_root_id" /><meta content="square/okhttp" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/ankit3005/okhttp/commits/prod.atom" rel="alternate" title="Recent Commits to okhttp:prod" type="application/atom+xml">

  </head>


  <body class="logged_in   env-production linux vis-public fork page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>

    
    
    



      <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/ankit3005/okhttp/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/ankit3005/okhttp/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      aria-label="Search this repository"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:apoorvmahajan"
        data-url="/notifications/header">
      <a href="/notifications" aria-label="You have unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:unread" data-hotkey="g n">
          <span class="mail-status unread"></span>
          <span class="octicon octicon-bell"></span>
</a>  </span>

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus left"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>




      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-s js-menu-target" href="/apoorvmahajan"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@apoorvmahajan" class="avatar" height="20" src="https://avatars1.githubusercontent.com/u/9305577?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu  dropdown-menu-sw">
        <div class=" dropdown-header header-nav-current-user css-truncate">
            Signed in as <strong class="css-truncate-target">apoorvmahajan</strong>

        </div>


        <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/apoorvmahajan" data-ga-click="Header, go to profile, text:your profile">
            Your profile
          </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
          <a class="dropdown-item" href="/integrations" data-ga-click="Header, go to integrations, text:integrations">
            Integrations
          </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>

          <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
            Settings
          </a>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="Ife499RYaAvvB71/zYwwBx2dVjU7ZGCerTC9ACRiD26PhpFDr1/x3klOhc6SiPkYU18Me6ra0xOJaQQisIi/OA==" /></div>
            <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
              Sign out
            </button>
</form>
      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>

      

      


    <div id="start-of-content" class="accessibility-aid"></div>

    <div id="js-flash-container">
</div>


    <div role="main" class="main-content">
        <div itemscope itemtype="http://schema.org/WebPage">
    <div class="pagehead repohead instapaper_ignore readability-menu">

      <div class="container">

        <div class="clearfix">
          

<ul class="pagehead-actions">

  <li>
      <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="qc/XvGoTsQ1GyLFGRlWo7cwW4W514KhttBpIhRgOaxxztP3PmK8RtfnD/0hAKpiTIOSmhrX40EupqKcvJ+DsYQ==" /></div>    <input id="repository_id" name="repository_id" type="hidden" value="44637451" />

      <div class="select-menu js-menu-container js-select-menu">
        <a href="/ankit3005/okhttp/subscription"
          class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
          data-ga-click="Repository, click Watch settings, action:blob#show">
          <span class="js-select-button">
            <span class="octicon octicon-eye"></span>
            Unwatch
          </span>
        </a>
        <a class="social-count js-social-count" href="/ankit3005/okhttp/watchers">
          3
        </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="select-menu-title">Notifications</span>
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
            </div>

            <div class="select-menu-list js-navigation-container" role="menu">

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_included" name="do" type="radio" value="included" />
                  <span class="select-menu-item-heading">Not watching</span>
                  <span class="description">Be notified when participating or @mentioned.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Watch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                  <span class="select-menu-item-heading">Watching</span>
                  <span class="description">Be notified of all conversations.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Unwatch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_ignore" name="do" type="radio" value="ignore" />
                  <span class="select-menu-item-heading">Ignoring</span>
                  <span class="description">Never be notified.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-mute"></span>
                    Stop ignoring
                  </span>
                </div>
              </div>

            </div>

          </div>
        </div>
      </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/ankit3005/okhttp/unstar" class="js-toggler-form starred js-unstar-button" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="EGNIS9/cACNFTX3mfcHHNHsY8iLP/cD44p7yxQ1CBty2MBdOyKm5s8oUBgys2LAg6W8RetphjEPPBFimvH4vkg==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar ankit3005/okhttp"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/ankit3005/okhttp/stargazers">
          0
        </a>
</form>
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/ankit3005/okhttp/star" class="js-toggler-form unstarred js-star-button" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="J6Hb/A6WKOCI7caNVlaoydcviou8TD7Yepn5Mm7qtZJpIduW7d9CUtcG4YxBbT+qgc0blQGC6jMLOEalxM4GBQ==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star ankit3005/okhttp"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/ankit3005/okhttp/stargazers">
          0
        </a>
</form>  </div>

  </li>

  <li>
          <a href="#fork-destination-box" class="btn btn-sm btn-with-count"
              title="Fork your own copy of ankit3005/okhttp to your account"
              aria-label="Fork your own copy of ankit3005/okhttp to your account"
              rel="facebox"
              data-ga-click="Repository, show fork modal, action:blob#show; text:Fork">
            <span class="octicon octicon-repo-forked"></span>
            Fork
          </a>

          <div id="fork-destination-box" style="display: none;">
            <h2 class="facebox-header" data-facebox-id="facebox-header">Where should we fork this repository?</h2>
            <include-fragment src=""
                class="js-fork-select-fragment fork-select-fragment"
                data-url="/ankit3005/okhttp/fork?fragment=1">
              <img alt="Loading" height="64" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-128.gif" width="64" />
            </include-fragment>
          </div>

    <a href="/ankit3005/okhttp/network" class="social-count">
      1,616
    </a>
  </li>
</ul>

          <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public ">
  <span class="mega-octicon octicon-repo-forked"></span>
  <span class="author"><a href="/ankit3005" class="url fn" itemprop="url" rel="author"><span itemprop="title">ankit3005</span></a></span><!--
--><span class="path-divider">/</span><!--
--><strong><a href="/ankit3005/okhttp" data-pjax="#js-repo-pjax-container">okhttp</a></strong>

  <span class="page-context-loader">
    <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
  </span>

    <span class="fork-flag">
      <span class="text">forked from <a href="/square/okhttp">square/okhttp</a></span>
    </span>
</h1>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline ">
        <div class="repository-sidebar clearfix">
          
<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/ankit3005/okhttp/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/ankit3005/okhttp/tree/prod" aria-label="Code" aria-selected="true" class="js-selected-navigation-item selected sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /ankit3005/okhttp/tree/prod">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>


    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/ankit3005/okhttp/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /ankit3005/okhttp/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Wiki">
        <a href="/ankit3005/okhttp/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-selected-links="repo_wiki /ankit3005/okhttp/wiki">
          <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/ankit3005/okhttp/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /ankit3005/okhttp/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/ankit3005/okhttp/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /ankit3005/okhttp/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>
  </ul>


</nav>

            <div class="only-with-full-nav">
                
<div class="js-clone-url clone-url open"
  data-protocol-type="http">
  <h3 class="text-small text-muted"><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini text-small text-muted input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/ankit3005/okhttp.git" readonly="readonly" aria-label="HTTPS clone URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="ssh">
  <h3 class="text-small text-muted"><span class="text-emphasized">SSH</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini text-small text-muted input-monospace js-url-field js-zeroclipboard-target"
           value="git@github.com:ankit3005/okhttp.git" readonly="readonly" aria-label="SSH clone URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="subversion">
  <h3 class="text-small text-muted"><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini text-small text-muted input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/ankit3005/okhttp" readonly="readonly" aria-label="Subversion checkout URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



<div class="clone-options text-small text-muted">You can clone with
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=http&amp;protocol_type=push" class="inline-form js-clone-selector-form is-enabled" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="uXbxidmFc1gP1Rye5WZuFONTkf76YemsKBlh8GU1I4GkP8ux+Zhs3i74LQpRA6OqVI8SW9A6N37mUoMpj6IjYA==" /></div><button class="btn-link js-clone-selector" data-protocol="http" type="submit">HTTPS</button></form>, <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=push" class="inline-form js-clone-selector-form is-enabled" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="gDO6OrfK8ukRLBANuTzECInBUkAI7TvTZ7obfASGCD96RVLNWyadAC+8GikDgdpLQn3lmAWy6vMSJSrPc8zPBw==" /></div><button class="btn-link js-clone-selector" data-protocol="ssh" type="submit">SSH</button></form>, or <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=push" class="inline-form js-clone-selector-form is-enabled" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="o2jlPWpuD2JqahxypcGQHXFkLgqBGIcNL2zQTuv9TKZVfJElA6x/TTcHQ09YLPW7Yvqj21YyqEbpBxwZdHyIaQ==" /></div><button class="btn-link js-clone-selector" data-protocol="subversion" type="submit">Subversion</button></form>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</div>

              <a href="/ankit3005/okhttp/archive/prod.zip"
                 class="btn btn-sm sidebar-button"
                 aria-label="Download the contents of ankit3005/okhttp as a zip file"
                 title="Download the contents of ankit3005/okhttp as a zip file"
                 rel="nofollow">
                <span class="octicon octicon-cloud-download"></span>
                Download ZIP
              </a>
            </div>
        </div>
        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>

          

<a href="/ankit3005/okhttp/blob/69b8535cbd673a39b30f5fdbf001325a2c9a4944/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:a87dc258ff5681fac47b6fb62ae9f65a -->

  <div class="file-navigation js-zeroclipboard-container">
    
<div class="select-menu js-menu-container js-select-menu left">
  <button class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    title="prod"
    type="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">prod</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Find or create a branch…" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.cancel-by-tag-synchronous/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.cancel-by-tag-synchronous"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.cancel-by-tag-synchronous">
                adrian.cancel-by-tag-synchronous
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.cancellation-exception/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.cancellation-exception"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.cancellation-exception">
                adrian.cancellation-exception
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.common-verbs/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.common-verbs"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.common-verbs">
                adrian.common-verbs
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.h2-final/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.h2-final"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.h2-final">
                adrian.h2-final
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.hpack/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.hpack"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.hpack">
                adrian.hpack
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.http2draft14-hpackdraft9/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.http2draft14-hpackdraft9"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.http2draft14-hpackdraft9">
                adrian.http2draft14-hpackdraft9
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.http2-initial-window/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.http2-initial-window"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.http2-initial-window">
                adrian.http2-initial-window
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.huffman-no-baos/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.huffman-no-baos"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.huffman-no-baos">
                adrian.huffman-no-baos
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.max-frame/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.max-frame"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.max-frame">
                adrian.max-frame
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.response-protocol/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.response-protocol"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.response-protocol">
                adrian.response-protocol
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/adrian.unused-imports/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="adrian.unused-imports"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="adrian.unused-imports">
                adrian.unused-imports
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/aosp_master/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="aosp_master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="aosp_master">
                aosp_master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/dge/http2-14/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="dge/http2-14"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="dge/http2-14">
                dge/http2-14
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/dlubarov.eager_route_selector/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="dlubarov.eager_route_selector"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="dlubarov.eager_route_selector">
                dlubarov.eager_route_selector
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/dlubarov.fast_connector/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="dlubarov.fast_connector"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="dlubarov.fast_connector">
                dlubarov.fast_connector
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/gh-pages/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="gh-pages"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="gh-pages">
                gh-pages
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/appending-sink/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/appending-sink"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/appending-sink">
                jw/appending-sink
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/be-lazy/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/be-lazy"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/be-lazy">
                jw/be-lazy
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/better-multipart/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/better-multipart"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/better-multipart">
                jw/better-multipart
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/buffer-mws/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/buffer-mws"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/buffer-mws">
                jw/buffer-mws
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/bump-okio/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/bump-okio"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/bump-okio">
                jw/bump-okio
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/byte-string-body/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/byte-string-body"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/byte-string-body">
                jw/byte-string-body
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/cache-control-cache-value/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/cache-control-cache-value"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/cache-control-cache-value">
                jw/cache-control-cache-value
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/clever-girl/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/clever-girl"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/clever-girl">
                jw/clever-girl
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/comment-fix/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/comment-fix"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/comment-fix">
                jw/comment-fix
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/eager-entry-files/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/eager-entry-files"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/eager-entry-files">
                jw/eager-entry-files
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/final-headers-builder/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/final-headers-builder"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/final-headers-builder">
                jw/final-headers-builder
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/framed/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/framed"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/framed">
                jw/framed
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/froyo-melted/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/froyo-melted"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/froyo-melted">
                jw/froyo-melted
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/generalize-ws-reply-executor/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/generalize-ws-reply-executor"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/generalize-ws-reply-executor">
                jw/generalize-ws-reply-executor
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/java-seven/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/java-seven"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/java-seven">
                jw/java-seven
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/javadoc/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/javadoc"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/javadoc">
                jw/javadoc
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/kill-halfway/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/kill-halfway"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/kill-halfway">
                jw/kill-halfway
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/kill-two-allocations/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/kill-two-allocations"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/kill-two-allocations">
                jw/kill-two-allocations
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/long-deprecated/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/long-deprecated"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/long-deprecated">
                jw/long-deprecated
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/long-limit/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/long-limit"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/long-limit">
                jw/long-limit
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/make-mws-rule-just-a-mws-instance/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/make-mws-rule-just-a-mws-instance"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/make-mws-rule-just-a-mws-instance">
                jw/make-mws-rule-just-a-mws-instance
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/master-version/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/master-version"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/master-version">
                jw/master-version
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/missing-quote/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/missing-quote"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/missing-quote">
                jw/missing-quote
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/mock-headers/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/mock-headers"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/mock-headers">
                jw/mock-headers
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/mock-response-headers/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/mock-response-headers"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/mock-response-headers">
                jw/mock-response-headers
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/more-long/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/more-long"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/more-long">
                jw/more-long
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/move/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/move"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/move">
                jw/move
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/move-string-helpers/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/move-string-helpers"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/move-string-helpers">
                jw/move-string-helpers
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/musings/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/musings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/musings">
                jw/musings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/mws-http-url/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/mws-http-url"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/mws-http-url">
                jw/mws-http-url
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/mws-style/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/mws-style"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/mws-style">
                jw/mws-style
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/never-null/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/never-null"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/never-null">
                jw/never-null
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/new-redirect-link/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/new-redirect-link"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/new-redirect-link">
                jw/new-redirect-link
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/no-body-for-you/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/no-body-for-you"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/no-body-for-you">
                jw/no-body-for-you
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/no-one-used-this/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/no-one-used-this"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/no-one-used-this">
                jw/no-one-used-this
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/normalize-exception-messages/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/normalize-exception-messages"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/normalize-exception-messages">
                jw/normalize-exception-messages
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/null-ref/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/null-ref"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/null-ref">
                jw/null-ref
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/okio-lru/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/okio-lru"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/okio-lru">
                jw/okio-lru
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/okio-mws/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/okio-mws"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/okio-mws">
                jw/okio-mws
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/one-one-oh/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/one-one-oh"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/one-one-oh">
                jw/one-one-oh
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/only-disconnect-responses/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/only-disconnect-responses"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/only-disconnect-responses">
                jw/only-disconnect-responses
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/pom-poms/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/pom-poms"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/pom-poms">
                jw/pom-poms
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/read-fully/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/read-fully"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/read-fully">
                jw/read-fully
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/reuse-behavior-from-core/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/reuse-behavior-from-core"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/reuse-behavior-from-core">
                jw/reuse-behavior-from-core
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/roundabout-kill/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/roundabout-kill"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/roundabout-kill">
                jw/roundabout-kill
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/shutdown-reply-executors/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/shutdown-reply-executors"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/shutdown-reply-executors">
                jw/shutdown-reply-executors
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/skip/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/skip"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/skip">
                jw/skip
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/small-tweaks/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/small-tweaks"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/small-tweaks">
                jw/small-tweaks
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/speedy/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/speedy"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/speedy">
                jw/speedy
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/start/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/start"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/start">
                jw/start
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/strict-mode/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/strict-mode"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/strict-mode">
                jw/strict-mode
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/tee-el-ess/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/tee-el-ess"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/tee-el-ess">
                jw/tee-el-ess
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/temp-folder/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/temp-folder"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/temp-folder">
                jw/temp-folder
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/test-case-insensitivity/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/test-case-insensitivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/test-case-insensitivity">
                jw/test-case-insensitivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/test-method/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/test-method"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/test-method">
                jw/test-method
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/throw-away-some-throws/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/throw-away-some-throws"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/throw-away-some-throws">
                jw/throw-away-some-throws
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/tiny-tweaks/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/tiny-tweaks"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/tiny-tweaks">
                jw/tiny-tweaks
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/towards-the-new-api-two/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/towards-the-new-api-two"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/towards-the-new-api-two">
                jw/towards-the-new-api-two
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/web-sockets/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/web-sockets"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/web-sockets">
                jw/web-sockets
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/website/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/website"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/website">
                jw/website
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/websocket-call/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/websocket-call"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/websocket-call">
                jw/websocket-call
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/wip-okio-mockwebserver/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/wip-okio-mockwebserver"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/wip-okio-mockwebserver">
                jw/wip-okio-mockwebserver
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/ws-response/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/ws-response"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/ws-response">
                jw/ws-response
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jw/zero/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jw/zero"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jw/zero">
                jw/zero
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jwilson_0430_testing_urls/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jwilson_0430_testing_urls"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jwilson_0430_testing_urls">
                jwilson_0430_testing_urls
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/jwilson_0921_novel_test_case/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="jwilson_0921_novel_test_case"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="jwilson_0921_novel_test_case">
                jwilson_0921_novel_test_case
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/kiran/internal-square/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="kiran/internal-square"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="kiran/internal-square">
                kiran/internal-square
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/kiran+kenji/add-active/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="kiran+kenji/add-active"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="kiran+kenji/add-active">
                kiran+kenji/add-active
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/marcelo/perm-redirect/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="marcelo/perm-redirect"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="marcelo/perm-redirect">
                marcelo/perm-redirect
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/master/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_13/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_13"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_13">
                okhttp_13
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_15/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_15"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_15">
                okhttp_15
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_16/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_16"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_16">
                okhttp_16
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_20/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_20"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_20">
                okhttp_20
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_21/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_21"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_21">
                okhttp_21
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_22/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_22"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_22">
                okhttp_22
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_23/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_23"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_23">
                okhttp_23
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_24/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_24"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_24">
                okhttp_24
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/ankit3005/okhttp/blob/okhttp_25/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="okhttp_25"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="okhttp_25">
                okhttp_25
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/ankit3005/okhttp/blob/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
               data-name="prod"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="prod">
                prod
              </span>
            </a>
        </div>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/ankit3005/okhttp/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="0zvVobHKKZ+D8ZJIf5XvefOPjfTyDM9OJ0ZYpzJ+m9TyRWH3H4eXr6DhI5jUuNmrNpuZRZXryNS/IaCwl0R+bA==" /></div>
            <span class="octicon octicon-git-branch select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <span class="select-menu-item-heading">Create branch: <span class="js-new-item-name"></span></span>
              <span class="description">from ‘prod’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="prod">
            <input type="hidden" name="path" id="path" value="okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java">
</form>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.5.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.5.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.5.0">parent-2.5.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.4.0-RC1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.4.0-RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.4.0-RC1">parent-2.4.0-RC1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.4.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.4.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.4.0">parent-2.4.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.3.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.3.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.3.0">parent-2.3.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.2.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.2.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.2.0">parent-2.2.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.1.0-RC1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.1.0-RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.1.0-RC1">parent-2.1.0-RC1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.1.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.1.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.1.0">parent-2.1.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.0.0-RC2/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.0.0-RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.0.0-RC2">parent-2.0.0-RC2</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.0.0-RC1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.0.0-RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.0.0-RC1">parent-2.0.0-RC1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-2.0.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-2.0.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-2.0.0">parent-2.0.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.6.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.6.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.6.0">parent-1.6.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.5.4/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.5.4"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.5.4">parent-1.5.4</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.5.3/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.5.3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.5.3">parent-1.5.3</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.5.2/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.5.2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.5.2">parent-1.5.2</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.5.1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.5.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.5.1">parent-1.5.1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.5.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.5.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.5.0">parent-1.5.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.2.1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.2.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.2.1">parent-1.2.1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.2.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.2.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.2.0">parent-1.2.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.1.1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.1.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.1.1">parent-1.1.1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.1.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.1.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.1.0">parent-1.1.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.0.2/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.0.2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.0.2">parent-1.0.2</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.0.1/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.0.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.0.1">parent-1.0.1</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/parent-1.0.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="parent-1.0.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="parent-1.0.0">parent-1.0.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/ankit3005/okhttp/tree/1.3.0/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java"
                 data-name="1.3.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="1.3.0">1.3.0</a>
            </div>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="btn-group right">
      <a href="/ankit3005/okhttp/find/prod"
            class="js-show-file-finder btn btn-sm empty-icon tooltipped tooltipped-nw"
            data-pjax
            data-hotkey="t"
            aria-label="Quickly jump between files">
        <span class="octicon octicon-list-unordered"></span>
      </a>
      <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </div>

    <div class="breadcrumb js-zeroclipboard-target">
      <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">okhttp</span></a></span></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">okhttp-apache</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src/test" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">test</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src/test/java" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">java</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src/test/java/com" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">com</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src/test/java/com/squareup" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">squareup</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src/test/java/com/squareup/okhttp" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">okhttp</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/ankit3005/okhttp/tree/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache" class="" data-branch="prod" data-pjax="true" itemscope="url"><span itemprop="title">apache</span></a></span><span class="separator">/</span><strong class="final-path">Test.java</strong>
    </div>
  </div>

<include-fragment class="commit-tease" src="/ankit3005/okhttp/contributors/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java">
  <div>
    Fetching contributors&hellip;
  </div>

  <div class="commit-tease-contributors">
    <img alt="" class="loader-loading left" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" />
    <span class="loader-error">Cannot retrieve contributors at this time</span>
  </div>
</include-fragment>
<div class="file">
  <div class="file-header">
  <div class="file-actions">

    <div class="btn-group">
      <a href="/ankit3005/okhttp/raw/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java" class="btn btn-sm " id="raw-url">Raw</a>
        <a href="/ankit3005/okhttp/blame/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
      <a href="/ankit3005/okhttp/commits/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java" class="btn btn-sm " rel="nofollow">History</a>
    </div>


        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/ankit3005/okhttp/edit/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java" class="inline-form js-update-url-with-hash" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="dmPG6/wCsy4gwJ0YQMtTYr5zGbi26WBc79JJJ07J2wK4J/SAJw9Vij560zI6fSrIKYk+ly2LuXE7b96+1wyXbw==" /></div>
          <button class="octicon-btn tooltipped tooltipped-nw" type="submit"
            aria-label="Edit this file" data-hotkey="e" data-disable-with>
            <span class="octicon octicon-pencil"></span>
          </button>
</form>        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/ankit3005/okhttp/delete/prod/okhttp-apache/src/test/java/com/squareup/okhttp/apache/Test.java" class="inline-form" data-form-nonce="e15e8dc056986a424a3f87375df0446852bee8a6" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="e2nilMxZOsRnxfj69e2Y3O43CH37ezOqBjy9Q1Bs+XSi2zSLaho9Edo1g6LONevcgwOObUHgD973vyjyxL6GLw==" /></div>
          <button class="octicon-btn octicon-btn-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Delete this file" data-disable-with>
            <span class="octicon octicon-trashcan"></span>
          </button>
</form>  </div>

  <div class="file-info">
      27 lines (21 sloc)
      <span class="file-info-divider"></span>
    581 Bytes
  </div>
</div>

  

  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> <span class="pl-smi">com.squareup.okhttp.apache</span>;</td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">junit.framework.*</span>;</td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">junit.textui.*</span>;</td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">Test</span> <span class="pl-k">extends</span> <span class="pl-e">TestCase</span> {</td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line">  <span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-k">void</span> <span class="pl-en">main</span>(<span class="pl-k">String</span>[] <span class="pl-v">args</span>) {</td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line">    <span class="pl-smi">TestRunner</span> runner <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">TestRunner</span>();</td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line">    <span class="pl-smi">TestResult</span> result <span class="pl-k">=</span> runner<span class="pl-k">.</span>doRun(suite(), <span class="pl-c1">false</span>);</td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">if</span> (<span class="pl-k">!</span> result<span class="pl-k">.</span>wasSuccessful()) {</td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line">      <span class="pl-smi">System</span><span class="pl-k">.</span>exit(<span class="pl-c1">1</span>);</td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line">  <span class="pl-k">public</span> <span class="pl-en">Test</span>(<span class="pl-smi">String</span> <span class="pl-v">name</span>) {</td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line">    <span class="pl-v">super</span>(name);</td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line">  <span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-smi">TestSuite</span> <span class="pl-en">suite</span>() {</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line">    <span class="pl-smi">TestSuite</span> result <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">TestSuite</span>();</td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line">    result<span class="pl-k">.</span>addTest(<span class="pl-k">new</span> <span class="pl-smi">TestSuite</span>(<span class="pl-smi">Test0</span><span class="pl-k">.</span>class));</td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line">    result<span class="pl-k">.</span>addTest(<span class="pl-k">new</span> <span class="pl-smi">TestSuite</span>(<span class="pl-smi">Test1</span><span class="pl-k">.</span>class));</td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">return</span> result;</td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

        </div>
      </div>
      <div class="modal-backdrop"></div>
    </div>
  </div>


    </div>

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://github.com/pricing" data-ga-click="Footer, go to pricing, text:pricing">Pricing</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.06974s from github-fe131-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



    
    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <span class="octicon octicon-x"></span>
      </button>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-161cec7f4cb9a187f66c2ecb8f59c9098e2ad64458af917ec72f9d61d6b8089b.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-f8a33925a6e1445f9151362d45f2f313f172c82e33c70a7fbe272ed0c76432d9.js"></script>
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner hidden">
      <span class="octicon octicon-alert"></span>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
  </body>
</html>

